package com.example.demo.java8.newfeature.bygovind.dateandtime;

import java.time.Year;
import java.util.Scanner;

public class YearClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int n = sc.nextInt();
        Year y = Year.of(n);
        if(y.isLeap()){
            System.out.printf("%d Year is Leap year", n);
        } else {
            System.out.printf("%d Year is Not a Leap year", n);
        }
    }
}

       /* Enter Year
        2011
        2011 Year is Not a Leap year

        Enter Year
        2012
        2012 Year is Leap year*/