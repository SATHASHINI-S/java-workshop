package com.project.Dao;

import com.project.model.Zone;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ZoneDao {
    private final DataSource dataSource;

    public ZoneDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Zone save(Zone zone) {
        String sql = "INSERT INTO zone (noOfRoom, floor_id) VALUES (?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, zone.noOfRoom());
            ps.setInt(2, zone.floor_id());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    return new Zone(zone.noOfRoom(), zone.floor_id(), keys.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving zone", e);
        }
        return null;
    }

    public List<Zone> findAll() {
        String sql = "SELECT * FROM zone";
        List<Zone> zones = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                zones.add(new Zone(
                        rs.getInt("noOfRoom"),
                        rs.getInt("floor_id"),
                        rs.getInt("zone_id")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving zones", e);
        }
        return zones;
    }

    public long count() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM zone");
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? rs.getLong(1) : 0;
        } catch (SQLException e) {
            throw new RuntimeException("Error counting zones", e);
        }
    }

    public void deleteAll() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM zone")) {
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting zones", e);
        }
    }
}
