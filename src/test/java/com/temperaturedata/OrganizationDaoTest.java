package com.temperaturedata;
//package com.temperaturedata;
//
//import com.temperaturedata.Dao.OrganizationDao;
//import com.temperaturedata.model.Organization;
//import org.h2.jdbcx.JdbcDataSource;
//import org.junit.Test;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class OrganizationDaoTest {
//    private final OrganizationDao dao;
//
//    public OrganizationDaoTest() throws SQLException {
//        JdbcDataSource ds = new JdbcDataSource();
//        ds.setURL("jdbc:h2:mem:" + System.nanoTime() + ";DB_CLOSE_DELAY=-1");
//
//        try (Connection conn = ds.getConnection();
//             Statement stmt = conn.createStatement()) {
//
//            stmt.execute("""
//                CREATE TABLE organization (
//                    id INT AUTO_INCREMENT PRIMARY KEY,
//                    name VARCHAR(255),
//                    contactno VARCHAR(20),
//                    email VARCHAR(255),
//                    website VARCHAR(255)
//                );
//            """);
//        }
//
//        dao = new OrganizationDao(ds);
//    }
//
//    @Test
//    public void testSaveAndFind() throws SQLException {
//        Organization org = dao.save(new Organization("OrgOne", "123456", "one@email.com", "orgone.com", null));
//        assertNotNull(org.id());
//
//        var found = dao.findById(org.id());
//        assertTrue(found.isPresent());
//        assertEquals("OrgOne", found.get().name());
//    }
//
//    @Test
//    public void testUpdate() throws SQLException {
//        Organization org = dao.save(new Organization("OrgTwo", "654321", "two@email.com", "orgt.com", null));
//        Organization updated = dao.save(new Organization("OrgUpdated", "999999", "up@email.com", "updated.org", org.id()));
//        assertEquals("OrgUpdated", updated.name());
//    }
//
//    @Test
//    public void testDeleteById() throws SQLException {
//        Organization org = dao.save(new Organization("Temp", "111111", "temp@mail.com", "temp.org", null));
//        dao.deleteById(org.id());
//        assertTrue(dao.findById(org.id()).isEmpty());
//    }
//
//    @Test
//    public void testDeleteAllAndCount() throws SQLException {
//        dao.save(new Organization("A", "1", "a@mail.com", "a.org", null));
//        dao.save(new Organization("B", "2", "b@mail.com", "b.org", null));
//        assertEquals(2, dao.count());
//        dao.deleteAll();
//        assertEquals(0, dao.count());
//    }
//
//    @Test
//    public void testFindAll() throws SQLException {
//        dao.deleteAll();
//        dao.save(new Organization("X", "101", "x@x.com", "x.org", null));
//        dao.save(new Organization("Y", "202", "y@y.com", "y.org", null));
//        List<Organization> list = dao.findAll();
//        assertEquals(2, list.size());
//    }
//}
