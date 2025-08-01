package com.temperaturedata.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.temperaturedata.model.Organization;
@Component
public class OrganizationDao {
    @Autowired
    private final DataSource dataSource;

    public OrganizationDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Organization save(Organization org) {
        String sql = "INSERT INTO organization (name, contactNo, email, website) VALUES (?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, org.name());
            ps.setString(2, org.contactno());
            ps.setString(3, org.email());
            ps.setString(4, org.website());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return new Organization(
                            org.name(), org.contactno(), org.email(), org.website(), rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving organization", e);
        }
        return null;
    }

    public int count() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT COUNT(*) FROM organization");
             ResultSet rs = ps.executeQuery()) {
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error counting organizations", e);
        }
    }
}
