package com.temperaturedata.beans;

public class Humidity implements Sensor{
    private float temp;

    public Humidity(float atemp){
        temp=atemp;
    }

    @Override
    public float getReading() {
        return temp;
    }


    @Override
    public float getReading(ReadingUnit unit) {
        if(ReadingUnit.K.equals(unit)){
            return temp/1000;
        }
        else{
            return temp/100;
        }
    }
}
