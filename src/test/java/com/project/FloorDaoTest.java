package com.project;

import com.project.Dao.FloorDao;
import com.project.model.Floor;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FloorDaoTest {
    private final FloorDao floorDao;

    public FloorDaoTest() throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:" + System.nanoTime() + ";DB_CLOSE_DELAY=-1");
        ds.setUser("satha");

        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute("""
                CREATE TABLE building (
                    building_id INT PRIMARY KEY
                );
            """);

            stmt.execute("""
                CREATE TABLE floor (
                    floor_id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255),
                    noOfZone INT,
                    building_id INT,
                    floor_no INT,
                    FOREIGN KEY (building_id) REFERENCES building(building_id)
                );
            """);

            // Insert one building for FK reference
            stmt.execute("INSERT INTO building(building_id) VALUES (201)");
        }

        floorDao = new FloorDao(ds);
    }

    @Test
    public void testSaveAndUpdate() throws SQLException {
        var saved = floorDao.save(new Floor("Ground", 2, null, 201, 0));
        assertNotNull(saved.floor_id());

        var updated = floorDao.save(new Floor("First", 3, saved.floor_id(), 201, 1));
        assertEquals(saved.floor_id(), updated.floor_id());
        assertEquals("First", updated.name());
    }

    @Test
    public void testFindAll() throws SQLException {
        floorDao.deleteAll();
        floorDao.save(new Floor("F1", 3, null, 201, 1));
        floorDao.save(new Floor("F2", 4, null, 201, 2));

        List<Floor> all = floorDao.findAll();
        assertEquals(2, all.size());
    }

    @Test
    public void testFindById() throws SQLException {
        var floor = floorDao.save(new Floor("F-Search", 2, null, 201, 1));
        var found = floorDao.findById(floor.floor_id());
        assertTrue(found.isPresent());
        assertEquals("F-Search", found.get().name());
    }

    @Test
    public void testDeleteById() throws SQLException {
        var floor = floorDao.save(new Floor("Temp", 1, null, 201, 0));
        floorDao.deleteById(floor.floor_id());
        assertTrue(floorDao.findById(floor.floor_id()).isEmpty());
    }

    @Test
    public void testDeleteAllAndCount() throws SQLException {
        floorDao.save(new Floor("T1", 2, null, 201, 1));
        floorDao.save(new Floor("T2", 3, null, 201, 2));
        assertEquals(2, floorDao.count());

        floorDao.deleteAll();
        assertEquals(0, floorDao.count());
    }
}
