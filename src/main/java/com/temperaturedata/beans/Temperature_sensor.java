package com.temperaturedata.beans;

public class Temperature_sensor implements Sensor{
    private float temp;
    public Temperature_sensor(float atemp){
        temp=atemp;
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
