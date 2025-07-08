package com.temperaturedata.beans;

import java.util.Calendar;

public final class Commercial extends Building{
    private String type;

    private Calendar openTime;
    private Calendar closeTime;

    public class Parking{
        public void parkingarea(){
            System.out.println("This is Parking Area");
        }
    }

    public void setOpenTime(Calendar timing){
        openTime=timing;
    }

    public Calendar getOpenTime(){
        return openTime;
    }

    @Override
    public void ebBill() {

    }

    public static void main(String[] args) {
        Commercial commer=new Commercial();
        Commercial.Parking parking=commer.new Parking();
        parking.parkingarea();
    }
}
