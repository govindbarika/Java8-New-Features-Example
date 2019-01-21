package com.example.demo.java8.newfeature.bygovind.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        System.out.println(numbers); //[0, 10, 20, 30, 5, 15, 25]
        List<Integer> naturalSorting = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(naturalSorting); //[0, 5, 10, 15, 20, 25, 30]

        List<Integer> reverseOrder = numbers.stream().sorted((e1, e2) -> e2.compareTo(e1)).collect(Collectors.toList());
        //numbers.stream().sorted(Comparator.reverseOrder())
        System.out.println(reverseOrder); //[30, 25, 20, 15, 10, 5, 0]
    }
}
