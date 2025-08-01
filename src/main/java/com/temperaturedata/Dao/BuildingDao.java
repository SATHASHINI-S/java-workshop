package com.temperaturedata.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import com.temperaturedata.model.Building;


public class BuildingDao {
    private final DataSource dataSource;

    public BuildingDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Building save(Building building) throws SQLException {
        if (building.building_id() == null) {
            final String insertSql = """
                INSERT INTO building (buildingname, latitude, longtitude, height, area, location_id)
                VALUES (?, ?, ?, ?, ?, ?)
            """;
            try (Connection conn = dataSource.getConnection();
                 PreparedStatement ps = conn.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)) {

                ps.setString(1, building.buildingname());
                ps.setString(2, building.latitude());
                ps.setString(3, building.longtitude());
                ps.setInt(4, building.height());
                ps.setInt(5, building.area());
                ps.setInt(6, building.location_id());

                ps.executeUpdate();
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        return new Building(
                                building.buildingname(),
                                building.latitude(),
                                building.longtitude(),
                                building.height(),
                                building.area(),
                                building.location_id(),
                                rs.getInt(1)
                        );
                    }
                }
            }
        } else {
            final String updateSql = """
                UPDATE building SET buildingname = ?, latitude = ?, longtitude = ?, height = ?, area = ?, location_id = ?
                WHERE building_id = ?
            """;
            try (Connection conn = dataSource.getConnection();
                 PreparedStatement ps = conn.prepareStatement(updateSql)) {

                ps.setString(1, building.buildingname());
                ps.setString(2, building.latitude());
                ps.setString(3, building.longtitude());
                ps.setInt(4, building.height());
                ps.setInt(5, building.area());
                ps.setInt(6, building.location_id());
                ps.setInt(7, building.building_id());

                ps.executeUpdate();
                return building;
            }
        }

        return building;
    }

    public List<Building> findAll() throws SQLException {
        final String sql = "SELECT * FROM building";
        List<Building> buildings = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                buildings.add(new Building(
                        rs.getString("buildingname"),
                        rs.getString("latitude"),
                        rs.getString("longtitude"),
                        rs.getInt("height"),
                        rs.getInt("area"),
                        rs.getInt("location_id"),
                        rs.getInt("building_id")
                ));
            }
        }
        return buildings;
    }

    public Optional<Building> findById(int id) throws SQLException {
        final String sql = "SELECT * FROM building WHERE building_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(new Building(
                            rs.getString("buildingname"),
                            rs.getString("latitude"),
                            rs.getString("longtitude"),
                            rs.getInt("height"),
                            rs.getInt("area"),
                            rs.getInt("location_id"),
                            rs.getInt("building_id")
                    ));
                }
            }
        }
        return Optional.empty();
    }

    public void deleteById(int id) throws SQLException {
        final String sql = "DELETE FROM building WHERE building_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public void deleteAll() throws SQLException {
        final String sql = "DELETE FROM building";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    public long count() throws SQLException {
        final String sql = "SELECT COUNT(*) FROM building";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return rs.getLong(1);
        }
        return 0;
    }
}
