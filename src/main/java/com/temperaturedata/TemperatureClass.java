package com.temperaturedata;

import com.exception.FindBuildingLength;
import com.temperaturedata.beans.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class TemperatureClass {
    public static void main(String[] args) {
        Location chennai = createLocation("4/2","North Street","Thambaram","Chennai","Chennai","Tamil Nadu","611100","India");
        Location cbe = createLocation("001","MGR STREET","SARAVANAMPATI","COIMBATORE","CBE","Tamil Nadu", "621114","India");
        List<Location> noOfObject = new ArrayList<>();
        noOfObject.add(chennai);
        noOfObject.add(cbe);
        Organization organization = new Organization();
        organization.setLocations(noOfObject);

        Commercial navigator = createComercial("WhiteGlass","Butterfly","Navigator",001,12);
        Commercial creator = createComercial("LiteShadeOfBrown","Rectangle","Creator",02,16);
        Commercial inventor = createComercial("WhiteGlass","Butterfly","Navigator",001,12);
        Commercial innovator = createComercial("LiteShadeOfBrown","Rectangle","Creator",02,16);


        List<Building> noOfCommercial = new ArrayList<>();
        noOfCommercial.add(navigator);
        noOfCommercial.add(creator);
        chennai.setBuildings(noOfCommercial);
        chennai.setBuildings(noOfCommercial);

        List<Building> noOfCbe = new ArrayList<>();
        noOfCbe.add(inventor);
        noOfCbe.add(innovator);
        cbe.setBuildings(noOfCbe);
        cbe.setBuildings(noOfCbe);

        Floor newfloor = floor(1,"floor 1");
        Floor secondFloor = floor(1,"floor 1");

        Set<Floor> floors = Set.of(newfloor,secondFloor);
        creator.setFloors(floors);





    }


    private static Location createLocation(String doorNo, String street, String area, String city, String district, String state, String pincode, String country){
        Location location = new Location();
        location.setDoorNo(doorNo);
        location.setStreet(street);
        location.setArea(area);
        location.setCity(city);
        location.setDistrict(district);
        location.setState(state);
        location.setCountry(country);
        location.setPincode(pincode);
        return location;
    }

    private static Commercial createComercial(String colour, String shape, String name, int bulidingNumber, double height){
        Commercial commercial = new Commercial();
        commercial.setColour(colour);
        commercial.setShape(shape);
        commercial.setName(name);
        commercial.setBulidingNumber(bulidingNumber);
        commercial.setHeight(height);
        return commercial;

    }

    private static Floor floor(int floorNumber, String name){
        Floor floor = new Floor();
        floor.setFloorNumber(floorNumber);
        floor.setName(name);
        return floor;

    }






//    public static void main(String[] args) throws FindBuildingLength {
//        Commercial commercial=new Commercial();
//        commercial.setNoOfFloors(97);
//
//        try{
//            Temperature_sensor temperatureSensor = new Temperature_sensor(45);
//            temperatureSensor = new Temperature_sensor(34);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void writeLocations(String filename,Location location ) {
//
//        try{
//            FileOutputStream fileOutput = new FileOutputStream(filename);
//            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
//            objectOutput.writeObject(location);
//            fileOutput.close();
//            objectOutput.close();
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }


}
