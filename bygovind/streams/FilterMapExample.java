package com.example.demo.java8.newfeature.bygovind.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapExample {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(){{
            add(0);
            add(5);
            add(10);
            add(15);
            add(20);
            add(25);
        }};
        List<Integer> evenNumberList = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList); //[0, 10, 20]

        List<Integer> doubledValues = l.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(doubledValues); //[0, 10, 20, 30, 40, 50]
    }
}
