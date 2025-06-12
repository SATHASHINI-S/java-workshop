package com.temperaturedata.beans;

import java.util.Calendar;

public class Commercial extends Building {
    private String type;
    private Calendar openTime;
    private Calendar closeTime;

    public void setOpenTime(Calendar timing){
        openTime=timing;
    }

    public Calendar getOpenTime(){
        return openTime;
    }

    @Override
    public void ebBill() {

    }
}
