package com.building;

public class Building {
    public void building(int building,int floor){
        System.out.println("Building No " +building);
        int i=0;
        while(i<floor){
            System.out.println("floor "+i);
            i++;
        }
    }
    public static void main(String[] args) {
        Building buildings=new Building();
        buildings.building(1,7);
        buildings.building(2,8);
        buildings.building(3,9);
    }
}
