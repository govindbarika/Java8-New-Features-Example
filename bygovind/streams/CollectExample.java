package com.example.demo.java8.newfeature.bygovind.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Govind");
        names.add("suresh");
        names.add("Raju");
        names.add("Ghouse");
        names.add("Mohan");

        List<String> namesLenghtGT5 = names.stream().filter(name -> name.length()>=5).collect(Collectors.toList());
        System.out.println(namesLenghtGT5); //[Govind, suresh, Ghouse, Mohan]

        List<String> namesInUppercase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesInUppercase); //[GOVIND, SURESH, RAJU, GHOUSE, MOHAN]

        long count = names.stream().filter(name -> name.length()>=5).count();
        System.out.println(count); //4
    }
}
