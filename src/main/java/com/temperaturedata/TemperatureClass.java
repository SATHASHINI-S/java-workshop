package com.temperaturedata;

import com.temperaturedata.beans.Humidity;
import com.temperaturedata.beans.ReadingUnit;
import com.temperaturedata.beans.Sensor;
import com.temperaturedata.beans.Temperature_sensor;



public class TemperatureClass {
    public static void main(String[] args) {
        Temperature_sensor tempSensor = new Temperature_sensor(25);

        Sensor humidity = new Humidity(16);
        System.out.println(tempSensor.getReading());
        System.out.println(tempSensor.getReading(ReadingUnit.F));
        System.out.println(humidity.getReading());
        System.out.println(humidity.getReading(ReadingUnit.K));


        System.out.println(tempSensor.getClass());
        System.out.println(tempSensor.hashCode());
        System.out.println(tempSensor.toString());

        Temperature_sensor temperature = new Temperature_sensor(25);
        System.out.println(temperature.getClass());
        System.out.println(temperature.hashCode());
        System.out.println(temperature.toString() );
        System.out.println(temperature.equals(tempSensor));






    }


}
