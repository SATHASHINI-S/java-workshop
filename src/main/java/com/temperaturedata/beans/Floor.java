package com.temperaturedata.beans;

import java.util.List;
import java.util.Set;

public class Floor {
    private Set<Zone> zones;
    private List<Sensor> sensors;
    private String name;
    private int noOfZone;
    private int floorNumber;

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfZone() {
        return noOfZone;
    }

    public void setNoOfZone(int noOfZone) {
        this.noOfZone = noOfZone;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Set<Zone> getZones() {
        return zones;
    }

    public void setZones(Set<Zone> zones) {
        this.zones = zones;
    }



}
