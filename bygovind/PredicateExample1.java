package com.example.demo.java8.newfeature.bygovind;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        String[] names = {"govind", "suresh", "manju", "ghouse", "ashok"};
        Predicate<String> namesStartsWithg = name -> name.startsWith("g");
        //Predicate<String> namesStartsWithg = name -> name.charAt(0)=='g';
        m1(names, namesStartsWithg);
    }

    public static void m1(String[] names, Predicate<String> namesStartsWithg) {
        for (String name : names){
            if(namesStartsWithg.test(name)){
                System.out.println(name);
            }
        }
    }
}
