package com.project.Dao;

import com.project.model.Org_Location;

import javax.sql.DataSource;
import java.sql.*;

public class Org_LocationDao {
    private final DataSource dataSource;

    public Org_LocationDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Org_Location save(Org_Location loc) {
        String sql = "INSERT INTO location (name, address, org_id) VALUES (?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, loc.name());
            ps.setString(2, loc.address());
            ps.setInt(3, loc.org_id());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return new Org_Location(
                            loc.name(), loc.address(), rs.getInt(1), loc.org_id());
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving location", e);
        }
        return null;
    }

    public int count() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM location");
             ResultSet rs = ps.executeQuery()) {
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error counting locations", e);
        }
    }
}
