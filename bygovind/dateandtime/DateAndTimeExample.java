package com.example.demo.java8.newfeature.bygovind.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //2019-01-21

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); //14:56:36.273

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); //2019-01-21T14:56:36.274
        //to get year, month and Day
        System.out.println(localDate.getDayOfMonth()); //21
        System.out.println(localDate.getMonthValue()); //1
        System.out.println(localDate.getYear()); //2019
        System.out.println();
        System.out.println(localTime);  //15:20:18.601
        System.out.println(localTime.getHour()); //15
        System.out.println(localTime.getMinute()); //20
        System.out.println(localTime.getSecond()); //18
        System.out.println(localTime.getNano()); //601000000
        System.out.println();
        System.out.println(localDateTime); //2019-01-21T15:28:15.725
        System.out.println(localDateTime.getDayOfMonth()); //21
        System.out.println(localDateTime.getMonthValue()); //1
        System.out.println(localDateTime.getYear()); //2019
        System.out.println(localDateTime.getHour()); //15
        System.out.println(localDateTime.getMinute()); //28
        System.out.println(localDateTime.getSecond()); //15
        System.out.println(localDateTime.getNano()); //725000000

        LocalDateTime localDateTime1 = LocalDateTime.of(1995, Month.APRIL, 25, 12, 34);
        System.out.println(localDateTime1); //1995-04-25T12:34

        System.out.println("Todays Date and Time :"+ localDateTime);
        System.out.println("After 6 months :" + localDateTime.plusMonths(6));
        System.out.println("After 15 Days :" +localDateTime.plusDays(15));
        System.out.println("After 10 Years :" + localDateTime.plusYears(10));
    }
}
