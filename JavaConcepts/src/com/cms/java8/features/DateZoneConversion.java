package com.cms.java8.features;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateZoneConversion {

    public static void main(String args[]){
        DateZoneConversion obj = new DateZoneConversion();
        obj.timeZoneConversion();
    }

    public void timeZoneConversion(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");
        String  date = new Date().toString();
        System.out.println("date::"+date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZoneId zone1 = ZoneId.of("GMT-7");//las vegas
        String lasvegas  = LocalDateTime.now(zone1).format(formatter);
        String johnston = LocalDateTime.now(ZoneId.of("GMT-5")).format(formatter);
        System.out.println("India::"+LocalDateTime.now().format(formatter));
        System.out.println("Johnston : " + johnston);
        System.out.println("Las vegas::"+lasvegas);
    }
}
