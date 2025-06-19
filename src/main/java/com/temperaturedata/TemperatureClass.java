package com.temperaturedata;

import com.exception.FindBuildingLength;
import com.temperaturedata.beans.*;

import java.io.*;
import java.time.LocalDate;


public class TemperatureClass {
    public static void main(String[] args) throws FindBuildingLength {
        Commercial commercial=new Commercial();
        commercial.setNoOfFloors(97);

        try{
            Temperature_sensor temperatureSensor = new Temperature_sensor(45);
            temperatureSensor = new Temperature_sensor(34);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void writeLocations(String filename,Location location ) {

        try{
            FileOutputStream fileOutput = new FileOutputStream(filename);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(location);
            fileOutput.close();
            objectOutput.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
