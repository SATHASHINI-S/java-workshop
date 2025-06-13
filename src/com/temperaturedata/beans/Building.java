package com.temperaturedata.beans;

public abstract sealed class Building permits Commercial, Residential {
    private Floor[] floors;
    private String colour;
    private String shape;
    private String name;
    private int bulidingNumber;
    private int noOfFloors;
    private double height;
    private double squareFeet;
    private Boolean parkingAvailable;
    public abstract void ebBill();
}
