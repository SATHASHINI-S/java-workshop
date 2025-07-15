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
                     CREATE TABLE building(colour VARCHAR(255), 
                     shape VARCHAR(255), String name VARCHAR(255), 
                     bulidingNumber INT, 
                     noOfFloors INT ,height DOUBLE)
        """);

        }

        buildingDao = new BuildingDao(jdbcDataSource);
    }

    @Test
    void testSave(){
        Building building = buildingDao.save(new Building("Blue","Circle","IT Park",001,25,222.3);
        Assertions.assertEquals("Blue",building.colour(),"Insert Failed");

    }
}
