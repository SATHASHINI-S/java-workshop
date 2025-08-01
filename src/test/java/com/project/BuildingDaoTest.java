package com.project;

import com.project.Dao.BuildingDao;
import com.project.model.Building;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BuildingDaoTest {
    private final BuildingDao buildingDao;

    public BuildingDaoTest() throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:" + System.nanoTime() + ";DB_CLOSE_DELAY=-1");
        ds.setUser("satha");

        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute("""
                CREATE TABLE location (
                    location_id INT PRIMARY KEY
                );
            """);

            stmt.execute("""
                CREATE TABLE building (
                    building_id INT AUTO_INCREMENT PRIMARY KEY,
                    buildingname VARCHAR(255),
                    latitude VARCHAR(255),
                    longtitude VARCHAR(255),
                    height INT,
                    area INT,
                    location_id INT,
                    FOREIGN KEY (location_id) REFERENCES location(location_id)
                );
            """);

            // insert dummy location for foreign key
            stmt.execute("INSERT INTO location(location_id) VALUES (101)");
        }

        buildingDao = new BuildingDao(ds);
    }

    @Test
    public void testSaveAndUpdate() throws SQLException {
        var saved = buildingDao.save(new Building("Gurukul", "12.34", "56.78", 100, 2000, 101, null));
        assertNotNull(saved.building_id());

        var updated = buildingDao.save(new Building("Gurukul Updated", "12.34", "56.78", 110, 2100, 101, saved.building_id()));
        assertEquals(saved.building_id(), updated.building_id());
        assertEquals("Gurukul Updated", updated.buildingname());
    }

    @Test
    public void testFindAll() throws SQLException {
        buildingDao.deleteAll();
        buildingDao.save(new Building("B1", "1", "2", 10, 100, 101, null));
        buildingDao.save(new Building("B2", "3", "4", 20, 200, 101, null));

        List<Building> all = buildingDao.findAll();
        assertEquals(2, all.size());
    }

    @Test
    public void testFindById() throws SQLException {
        var b = buildingDao.save(new Building("Unique", "0", "0", 1, 1, 101, null));
        var found = buildingDao.findById(b.building_id());
        assertTrue(found.isPresent());
        assertEquals("Unique", found.get().buildingname());
    }

    @Test
    public void testDeleteById() throws SQLException {
        var b = buildingDao.save(new Building("ToDelete", "0", "0", 1, 1, 101, null));
        buildingDao.deleteById(b.building_id());
        assertTrue(buildingDao.findById(b.building_id()).isEmpty());
    }

    @Test
    public void testDeleteAllAndCount() throws SQLException {
        buildingDao.save(new Building("X", "x", "x", 1, 1, 101, null));
        buildingDao.save(new Building("Y", "y", "y", 2, 2, 101, null));
        assertEquals(2, buildingDao.count());

        buildingDao.deleteAll();
        assertEquals(0, buildingDao.count());
    }
}
