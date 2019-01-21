package com.example.demo.java8.newfeature.bygovind;

import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(((o1, o2) -> {return o1>o2?-1:o1<o2?1:0;}));
        t.add(10);
        t.add(5);
        t.add(20);
        t.add(15);
        t.add(25);
        System.out.println("Before Sorting: "+ t);
    }
}
