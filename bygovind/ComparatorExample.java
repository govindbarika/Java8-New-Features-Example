package com.example.demo.java8.newfeature.bygovind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(5);
        l.add(20);
        l.add(15);
        l.add(25);
        System.out.println("Before Sorting: "+ l);
        Collections.sort(l, (o1, o2) -> {return o1>o2?-1:o1<o2?1:0;});
        System.out.println("After Sorting: "+ l);
    }
}/*
class DescCompatrator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1>o2?-1:o1<o2?1:0;
    }
}
*/