package com.temperaturedata.beans;

public class Temperature_sensor implements Sensor{
    private float temp;
    public void setTemp(float atemp){
        temp=atemp;
    }

    public

    @Override
    public float getReading() {
        return 0;
    }
}
