package com.example.demo.java8.newfeature.bygovind.streams;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("govind");
        names.add("barika");
        names.add("suresh");
        names.add("ghouse");
        names.add("ashok");
        names.stream().forEach(System.out::println);
    }
}
