package com.example.demo.java8.newfeature.bygovind;

import java.util.function.Predicate;

public class PredicateJoiningExample {
    public static void main(String[] args) {
        int[] array = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i -> i>10;
        Predicate<Integer> p2 = i -> i%2==0;
        System.out.println("The Numbers greater than 10");
        m1(array, p1);
        System.out.println("The even numbers");
        m1(array, p2);
        System.out.println("The odd numbers or not even numbers");
        m1(array, p2.negate());
        System.out.println("The numbers greater than 10 and even numbers");
        m1(array, p1.and(p2));
        System.out.println("The numbers greater than 10 or even numbers");
        m1(array, p1.or(p2));
    }

    public static void m1(int[] input, Predicate<Integer> predicate) {
        for (int i : input){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }
}
