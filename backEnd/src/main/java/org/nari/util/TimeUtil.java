package org.nari.util;

import java.util.Date;

public class TimeUtil {
    public static final int MINUTE = 60000;

    public static Date getCurDate(){
        return new Date();
    }

    public static Date plusMinute(Date date, int minute){
        return new Date(date.getTime() + minute * MINUTE);
    }

    public static void main(String[] args) {
        Date d = getCurDate();
        Date d2 = plusMinute(d,20);
        System.out.println(d.compareTo(d2));
    }
}
