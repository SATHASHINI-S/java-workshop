package com.temperaturedata.beans;

import com.exception.TemperatureRangeException;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Map;

public class Temperature_sensor implements Sensor{
    private float temp;

    public Map<LocalDateTime, Temperature> getTemperatureMap() {
        return temperatureMap;
    }

    public void setTemperatureMap(Map<LocalDateTime, Temperature> temperatureMap) {
        this.temperatureMap = temperatureMap;
    }

    private Map<LocalDateTime ,Temperature> temperatureMap;


    public Temperature_sensor(float atemp) throws TemperatureRangeException {
        if(atemp <-89 || atemp > 58){
            throw new TemperatureRangeException("Temperature is out of range");
        }
        temp = atemp;
    }


    @Override
    public float getReading() {
        return temp;
    }

    @Override
    public float getReading(ReadingUnit unit) {
        if(ReadingUnit.F.equals(unit) ){
            return (temp*9/5)+32;
        }
        else{
            return temp;
        }

    }

    @Override
    public String toString() {
        return "Temperature " + temp;
    }

    @Override
    public int hashCode(){
        return (int)temp*34;
    }

    @Override
    public boolean equals(Object temperature){
        Temperature_sensor myobj=(Temperature_sensor) temperature;


        if (super.equals((myobj))){
            return true;
        }
        else{
            return this.temp == myobj.temp;
        }
    }








}
