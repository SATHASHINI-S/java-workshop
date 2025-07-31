package com.project;

import com.project.Dao.SensorDao;
import com.project.model.Sensor;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SensorDaoTest {

    private final SensorDao sensorDao;

    public SensorDaoTest() throws SQLException {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        ds.setUser("satha");

        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute("""
                CREATE TABLE IF NOT EXISTS sensor(
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    sensor_type VARCHAR(255)
                )
            """);
        }

        sensorDao = new SensorDao(ds);
    }

    @Test
    public void testSaveAndUpdate() throws SQLException {
        Sensor sensor = sensorDao.save(new Sensor(null, "Temperature"));
        assertNotNull(sensor.id());
        assertEquals("Temperature", sensor.sensor_type());

        Sensor updated = sensorDao.save(new Sensor(sensor.id(), "Humidity"));
        assertEquals(sensor.id(), updated.id());
        assertEquals("Humidity", updated.sensor_type());
    }

    @Test
    public void testFindAll() throws SQLException {
        sensorDao.save(new Sensor(null, "Type1"));
        sensorDao.save(new Sensor(null, "Type2"));

        List<Sensor> all = sensorDao.findAll();
        assertEquals(2, all.size());
    }

    @Test
    public void testFindById() throws SQLException {
        Sensor sensor = sensorDao.save(new Sensor(null, "Pressure"));
        var found = sensorDao.findById(sensor.id());
        assertTrue(found.isPresent());
        assertEquals("Pressure", found.get().sensor_type());
    }

    @Test
    public void testDeleteById() throws SQLException {
        Sensor sensor = sensorDao.save(new Sensor(null, "Gas"));
        sensorDao.deleteById(sensor.id());
        assertTrue(sensorDao.findById(sensor.id()).isEmpty());
    }

    @Test
    public void testDeleteAll() throws SQLException {
        sensorDao.save(new Sensor(null, "X"));
        sensorDao.save(new Sensor(null, "Y"));
        sensorDao.deleteAll();
        assertEquals(0, sensorDao.count());
    }

    @Test
    public void testCount() throws SQLException {
        sensorDao.save(new Sensor(null, "Alpha"));
        sensorDao.save(new Sensor(null, "Beta"));
        assertEquals(2, sensorDao.count());
    }
}
