package com.temperaturedata.beans;

public class Residential extends Building{
    String type;


    public void setType(String atype){
        type=atype;
    }

    public String getType(){
        return type;
    }
    @Override
    public void ebBill() {

    }
}
