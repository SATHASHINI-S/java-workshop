package com.project;

import com.project.Dao.BuildingDao;
import com.project.model.Building;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BuildingDaoTest {
    private final BuildingDao buildingDao;

    public BuildingDaoTest() throws SQLException {
        JdbcDataSource jdbcDataSource = new JdbcDataSource();
        jdbcDataSource.setURL("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        jdbcDataSource.setUser("satha");
        try(Connection connection = jdbcDataSource.getConnection();
            Statement statement = connection.createStatement()) {
            statement.execute("""
                     CREATE TABLE building(
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     colour VARCHAR(255), 
                     shape VARCHAR(255), name VARCHAR(255), 
                     bulidingNumber INT, 
                     noOfFloors INT ,height DOUBLE)
        """);

        }

        buildingDao = new BuildingDao(jdbcDataSource);
    }

    @Test
    public void testSave() throws SQLException {
        Building building = buildingDao.save(new Building(null,"Blue","Circle","IT Park",001,25,222.3));
        Assertions.assertEquals("Blue",building.colour(),"Insert Failed");

        Building update = buildingDao.save(new Building(building.id(), "Light Blue", building.shape(), building.name(), building.bulidingNumber(),building.noOfFloors(), building.height()));
        Assertions.assertEquals(update.id(),building.id());
        Assertions.assertEquals("Light Blue",update.colour(),"Not updated");

    }
    @Test
    public void testFindAll(){


    }


}
