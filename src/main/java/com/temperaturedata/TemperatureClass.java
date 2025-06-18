package com.temperaturedata;

import com.temperaturedata.beans.*;

import java.io.*;
import java.time.LocalDate;


public class TemperatureClass {
    public static void main(String[] args) {
//        Temperature_sensor tempSensor = new Temperature_sensor(25);
//
//        Sensor humidity = new Humidity(16);
//        System.out.println(tempSensor.getReading());
//        System.out.println(tempSensor.getReading(ReadingUnit.F));
//        System.out.println(humidity.getReading());
//        System.out.println(humidity.getReading(ReadingUnit.K));
//
//
//        System.out.println(tempSensor.getClass());
//        System.out.println(tempSensor.hashCode());
//        System.out.println(tempSensor.toString());
//
//        Temperature_sensor temperature = new Temperature_sensor(25);
//        System.out.println(temperature.getClass());
//        System.out.println(temperature.hashCode());
//        System.out.println(temperature.toString() );
//        System.out.println(temperature.equals(tempSensor));


        Organization oruKadaiTechnology = new Organization();

        oruKadaiTechnology.setCeo("Maddu Bro");
        oruKadaiTechnology.setName("OruKadaiTechnology");
        oruKadaiTechnology.setType("IT Technologies");
        oruKadaiTechnology.setPhone("+919751351380");
        oruKadaiTechnology.setDateOfInitiation(LocalDate.of(2021,11,28));
        oruKadaiTechnology.setEmail("inteligence@orukadaitechnology.com");

        try{
            FileOutputStream outputStream = new FileOutputStream("OruKadaiTechnology.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(oruKadaiTechnology);
            objectOutputStream.close();
            outputStream.close();
            FileInputStream fileInputStream = new FileInputStream("OruKadaiTechnology.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Organization myorg = (Organization) objectInputStream.readObject();
            System.out.println(myorg);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Location location = new Location();
        location.setArea("Oothakadai");
        location.setCity("Madurai");
        location.setCountry("India");
        location.setLatitute(1236.2548);
        location.setLongtitute(1458.36);
        location.setStreet("Neethi Street");
        location.setPincode("621 715");
        try{
            FileOutputStream fileOutput = new FileOutputStream("location.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(location);
            fileOutput.close();
            objectOutput.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Location location1 = new Location();
        location1.setArea("Oothakadai");
        location1.setCity("Madurai");
        location1.setCountry("India");
        location1.setLatitute(1236.2548);
        location1.setLongtitute(1458.36);
        location1.setStreet("Neethi Street");
        location1.setPincode("621 715");

        try {
            FileOutputStream outputSt = new FileOutputStream("location1.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(outputSt);
            objectOut.writeObject(location1);
            outputSt.close();
            objectOut.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
