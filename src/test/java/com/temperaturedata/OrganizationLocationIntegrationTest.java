package com.temperaturedata;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.jdbcx.JdbcDataSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.temperaturedata.Dao.Org_LocationDao;
import com.temperaturedata.Dao.OrganizationDao;
import com.temperaturedata.model.Org_Location;
import com.temperaturedata.model.Organization;

public class OrganizationLocationIntegrationTest {
    private static OrganizationDao organizationDao;
    private static Org_LocationDao orgLocationDao;

    
    @BeforeAll
    static void setup() throws Exception {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:mem:orglocdb;DB_CLOSE_DELAY=-1");
        ds.setUser("nexa");

        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.execute("""
                CREATE TABLE organization (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255),
                    contactNo VARCHAR(20),
                    email VARCHAR(255),
                    website VARCHAR(255)
                )
            """);

            stmt.execute("""
                CREATE TABLE location (
                    location_id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(255),
                    address VARCHAR(255),
                    org_id INT,
                    FOREIGN KEY (org_id) REFERENCES organization(id)
                )
            """);
        }

        organizationDao = new OrganizationDao(ds);
        orgLocationDao = new Org_LocationDao(ds);
    }

    @Test
    public void testSaveOrganizationAndLocation() throws SQLException {
        Organization org = new Organization("Google", "9876543210", "contact@google.com", "www.google.com", null);
        Organization savedOrg = organizationDao.save(org);
        assertNotNull(savedOrg.id());
        assertEquals("Google", savedOrg.name());

        Org_Location loc = new Org_Location("Bangalore", "BTM Layout", null, savedOrg.id());
        Org_Location savedLoc = orgLocationDao.save(loc);
        assertNotNull(savedLoc.location_id());
        assertEquals("Bangalore", savedLoc.name());
    }
}
