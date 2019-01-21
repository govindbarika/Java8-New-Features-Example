package com.example.demo.java8.newfeature.bygovind.dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {
    public static void main(String[] args) {
        ZoneId id = ZoneId.systemDefault();
        System.out.println(id); //Asia/Calcutta

        ZoneId la =ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);
        System.out.println(zt); //2019-01-21T03:04:39.455-08:00[America/Los_Angeles]
    }
}
