package com.example.demo.java8.newfeature.bygovind.dateandtime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1988, 06, 25);
        LocalDate today = LocalDate.now(); //2019-01-21
        Period p = Period.between(birthDay, today);
        System.out.printf("Age is %d Years, %d Months and %d days", p.getYears(), p.getMonths(), p.getDays());  //Age is 30 Years, 6 Months and 27 days
    }
}
