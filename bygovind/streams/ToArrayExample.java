package com.example.demo.java8.newfeature.bygovind.streams;

import java.util.ArrayList;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);

        Integer[] array = numbers.stream().toArray(Integer[]::new);
        for(Integer i : array){
            System.out.println(i);
        }
    }
}
