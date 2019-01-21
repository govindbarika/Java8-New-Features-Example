package com.example.demo.java8.newfeature.bygovind.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);

        Integer min = numbers.stream().min((e1, e2) -> e1.compareTo(e2)).get();
        //Integer min = numbers.stream().min(Integer::compareTo).get();
        //Integer min = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min value is : "+min);

        Integer max = numbers.stream().max((e1, e2) -> e1.compareTo(e2)).get();
        //Integer max = numbers.stream().max(Integer::compareTo).get();
        //Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max value is : " + max);
    }
}
