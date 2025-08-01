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

import com.temperaturedata.model.Floor;

public class FloorDao {
    private final DataSource dataSource;

    public FloorDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Floor save(Floor floor) throws SQLException {
        if (floor.floor_id() == null) {
            final String insertSql = """
                INSERT INTO floor (name, noOfZone, building_id, floor_no)
                VALUES (?, ?, ?, ?)
            """;
            try (Connection conn = dataSource.getConnection();
                 PreparedStatement ps = conn.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)) {

                ps.setString(1, floor.name());
                ps.setInt(2, floor.noOfZone());
                ps.setInt(3, floor.building_id());
                ps.setInt(4, floor.floor_no());

                ps.executeUpdate();
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        return new Floor(
                                floor.name(),
                                floor.noOfZone(),
                                rs.getInt(1),
                                floor.building_id(),
                                floor.floor_no()
                        );
                    }
                }
            }
        } else {
            final String updateSql = """
                UPDATE floor SET name = ?, noOfZone = ?, building_id = ?, floor_no = ?
                WHERE floor_id = ?
            """;
            try (Connection conn = dataSource.getConnection();
                 PreparedStatement ps = conn.prepareStatement(updateSql)) {

                ps.setString(1, floor.name());
                ps.setInt(2, floor.noOfZone());
                ps.setInt(3, floor.building_id());
                ps.setInt(4, floor.floor_no());
                ps.setInt(5, floor.floor_id());

                ps.executeUpdate();
                return floor;
            }
        }

        return floor;
    }

    public List<Floor> findAll() throws SQLException {
        final String sql = "SELECT * FROM floor";
        List<Floor> floors = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                floors.add(new Floor(
                        rs.getString("name"),
                        rs.getInt("noOfZone"),
                        rs.getInt("floor_id"),
                        rs.getInt("building_id"),
                        rs.getInt("floor_no")
                ));
            }
        }
        return floors;
    }

    public Optional<Floor> findById(int id) throws SQLException {
        final String sql = "SELECT * FROM floor WHERE floor_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(new Floor(
                            rs.getString("name"),
                            rs.getInt("noOfZone"),
                            rs.getInt("floor_id"),
                            rs.getInt("building_id"),
                            rs.getInt("floor_no")
                    ));
                }
            }
        }
        return Optional.empty();
    }

    public void deleteById(int id) throws SQLException {
        final String sql = "DELETE FROM floor WHERE floor_id = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public void deleteAll() throws SQLException {
        final String sql = "DELETE FROM floor";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    public long count() throws SQLException {
        final String sql = "SELECT COUNT(*) FROM floor";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return rs.getLong(1);
        }
        return 0;
    }
}
