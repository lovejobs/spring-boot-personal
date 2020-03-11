package com.lovejobs.jdk8.date;

import java.time.*;

public class JDK8Date {

    private static void localDate(){
        LocalDate localDate = LocalDateTime.now().toLocalDate();
        System.out.println("date: " + localDate);
        System.out.println("date day of month: " + localDate.getDayOfMonth());
        System.out.println("date day of week: " + localDate.getDayOfWeek());
        System.out.println("date day of year: " + localDate.getDayOfYear());
    }

    private static void localDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("dateTime: " + localDateTime);
        System.out.println("dateTime day of month: " + localDateTime.getDayOfMonth());
        System.out.println("dateTime day of week: " + localDateTime.getDayOfWeek());
        System.out.println("dateTime day of year: " + localDateTime.getDayOfYear());
    }

    private static void  modLocalDateTime(){
        LocalDate localDate = LocalDate.of(2019,01,02);
        LocalTime localTime = LocalTime.of(03,12,03);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime: " + localDateTime);
    }

    private static void zonedDateTime(){
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        ZoneId id = ZoneId.of("Europe/Paris");
    }

    public static void main(String[] args) {
        localDate();
        localDateTime();
        modLocalDateTime();
    }
}
