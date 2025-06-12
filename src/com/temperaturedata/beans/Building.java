package com.temperaturedata.beans;

public abstract class Building {
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
