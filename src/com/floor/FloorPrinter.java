package com.floor;

public class FloorPrinter {
    public void print(int floor){
        for(int i = 0;i < floor;i++){
            System.out.println("Floor no" +i);
        }
    }

    public static void main(String[] args) {
        FloorPrinter floorPrinter=new FloorPrinter();
        floorPrinter.print(15);
    }
}
