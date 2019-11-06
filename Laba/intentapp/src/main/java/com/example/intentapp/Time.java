package com.example.intentapp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    String format;

    public  Time(String format){
        this.format = format;
    }

    public String getSystemTime(){

        long dateInMillis = System.currentTimeMillis();
        final SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.format(new Date(dateInMillis));
    }
}
