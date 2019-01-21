package com.example.demo.java8.newfeature.bygovind;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterNotNullStringValues {
    public static void main(String[] args) {
        String[] names = {"govind", "", null, "suresh", null};
        Predicate<String> notNullAndNonEmpty = s -> s!= null && s.length()!=0;
        m1(names, notNullAndNonEmpty);
    }

    public static void m1(String[] names, Predicate<String> predicate) {
        ArrayList al = new ArrayList();
        for(String name: names){
            if(predicate.test(name)){
                al.add(name);
            }
        }
        System.out.println(al);
    }
}
