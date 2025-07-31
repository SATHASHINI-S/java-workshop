package com.project.Dao;

import com.project.model.Sensor;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SensorDao {
    private final DataSource dataSource;

    public SensorDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Sensor save(Sensor sensor) throws SQLException {
        if(sensor.id() == null) {
            final String insertSql = "INSERT INTO sensor (sensor_type) VALUES(?)";
            try (Connection connection = dataSource.getConnection();
                 PreparedStatement ps = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, sensor.sensor_type());
                ps.executeUpdate();

                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        return new Sensor(rs.getInt(1), sensor.sensor_type());
                    }
                }
            }
        } else {
            final String updateSql = "UPDATE sensor SET sensor_type = ? WHERE id = ?";
            try (Connection connection = dataSource.getConnection();
                 PreparedStatement ps = connection.prepareStatement(updateSql)) {
                ps.setString(1, sensor.sensor_type());
                ps.setInt(2, sensor.id());
                ps.executeUpdate();
                return sensor;
            }
        }
        return sensor;
    }

    public List<Sensor> findAll() throws SQLException {
        final String sql = "SELECT id, sensor_type FROM sensor";
        List<Sensor> sensors = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                sensors.add(new Sensor(rs.getInt("id"), rs.getString("sensor_type")));
            }
        }
        return sensors;
    }

    public Optional<Sensor> findById(int id) throws SQLException {
        final String sql = "SELECT id, sensor_type FROM sensor WHERE id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(new Sensor(rs.getInt("id"), rs.getString("sensor_type")));
                }
            }
        }
        return Optional.empty();
    }

    public void deleteById(int id) throws SQLException {
        final String sql = "DELETE FROM sensor WHERE id = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public void deleteAll() throws SQLException {
        final String sql = "DELETE FROM sensor";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    public long count() throws SQLException {
        final String sql = "SELECT COUNT(*) FROM sensor";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getLong(1);
            }
        }
        return 0;
    }
}
