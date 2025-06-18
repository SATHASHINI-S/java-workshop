package com.temperaturedata;

import com.temperaturedata.beans.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class LocationForTest {
    @Test
    public void locationFunction() throws IOException, ClassNotFoundException {
        TemperatureClass temperatureClass = new TemperatureClass();

        Location location = new Location();
        location.setArea("MGR");
        location.setCity("Coimbatore");
        location.setCountry("India");
        location.setLatitute(1236.2548);
        location.setLongtitute(1458.36);
        location.setStreet("Neethi Street");
        location.setPincode("621 715");
        temperatureClass.writeLocations("Coimbatore.txt",location);

        File myfile = new File("Coimbatore.txt");
        Assertions.assertTrue(myfile.exists());

        FileInputStream fileInputStream = new FileInputStream("Coimbatore.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Location location2 =(Location) objectInputStream.readObject();
        Assertions.assertEquals(location.getCity(),location2.getCity());
        Assertions.assertEquals(location.getCountry(),location2.getCountry());

        Location location1 = new Location();
        location1.setArea("Vadapalani");
        location1.setCity("Chennai");
        location1.setCountry("India");
        location1.setLatitute(1236.2548);
        location1.setLongtitute(1458.36);
        location1.setStreet("Neethi Street");
        location1.setPincode("621 715");

        temperatureClass.writeLocations("Chennai.txt",location1);
        File myfiles = new File("Chennai.txt");
        Assertions.assertTrue(myfiles.exists());

        fileInputStream = new FileInputStream("Chennai.txt");
        objectInputStream = new ObjectInputStream(fileInputStream);
        location2 =(Location) objectInputStream.readObject();
        Assertions.assertEquals(location1.getCity(),location2.getCity());

    }
}
