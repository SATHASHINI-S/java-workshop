package com.temperaturedata;
// package com.temperaturedata;

// import com.temperaturedata.Dao.ZoneDao;
// import com.temperaturedata.model.Zone;
// import org.h2.jdbcx.JdbcDataSource;
// import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.Test;

// import java.sql.Connection;
// import java.sql.Statement;
// import java.util.List;

// import static org.junit.jupiter.api.Assertions.*;

// public class ZoneDaoTest {
//     private static ZoneDao zoneDao;

//     @BeforeAll
//     static void setup() throws Exception {
//         JdbcDataSource ds = new JdbcDataSource();
//         ds.setURL("jdbc:h2:mem:zoneDB;DB_CLOSE_DELAY=-1");
//         ds.setUser("nexa");

//         try (Connection conn = ds.getConnection();
//              Statement stmt = conn.createStatement()) {

//             stmt.execute("""
//                 CREATE TABLE floor (
//                     floor_id INT PRIMARY KEY,
//                     name VARCHAR(255),
//                     noOfZone INT,
//                     building_id INT,
//                     floor_no INT
//                 )
//             """);

//             stmt.execute("""
//                 CREATE TABLE zone (
//                     zone_id INT AUTO_INCREMENT PRIMARY KEY,
//                     noOfRoom INT,
//                     floor_id INT,
//                     FOREIGN KEY (floor_id) REFERENCES floor(floor_id)
//                 )
//             """);

//             stmt.execute("INSERT INTO floor (floor_id, name, noOfZone, building_id, floor_no) VALUES (1, 'First', 3, 101, 1)");
//         }

//         zoneDao = new ZoneDao(ds);
//     }

//     @Test
//     public void testZoneCrud() {
//         zoneDao.deleteAll();
//         Zone z1 = zoneDao.save(new Zone(5, 1, null));
//         Zone z2 = zoneDao.save(new Zone(6, 1, null));

//         assertNotNull(z1.zone_id());
//         assertNotNull(z2.zone_id());

//         List<Zone> all = zoneDao.findAll();
//         assertEquals(2, all.size());

//         assertEquals(2, zoneDao.count());
//     }
// }
