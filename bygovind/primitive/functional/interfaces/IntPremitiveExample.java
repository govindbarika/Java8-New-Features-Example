package com.example.demo.java8.newfeature.bygovind.primitive.functional.interfaces;

import java.util.function.IntPredicate;

public class IntPremitiveExample {
    public static void main(String[] args) {
        int[] input = {0, 5, 10, 15, 20, 25};
        IntPredicate ip = i -> i%2==0;
        for(int i : input){
            if(ip.test(i)){
                System.out.println(i);
            }
        }
    }
}
