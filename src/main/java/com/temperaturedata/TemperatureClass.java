package com.temperaturedata;

import com.temperaturedata.beans.*;

import java.io.*;
import java.time.LocalDate;


public class TemperatureClass {
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
