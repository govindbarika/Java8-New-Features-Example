package com.example.demo.java8.newfeature.bygovind.primitive.functional.interfaces;

import java.util.function.IntFunction;

public class IntFunctionExample {
    public static void main(String[] args) {
        IntFunction<Integer> f = i -> i*i;
        System.out.println(f.apply(5));

        String[] words ={"govind", "barika", "chaithanya"};
        for(String word: words){
            if("barika".equals(word)){
                System.out.println(word);
            }
        }


    }
}
