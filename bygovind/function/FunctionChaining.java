package com.example.demo.java8.newfeature.bygovind.function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = s -> s.substring(0, 10);
        System.out.println("The result of f1 :" +f1.apply("GovindappaBarika"));
        System.out.println("The result of f2 :"+ f2.apply("GovindappaBarika"));
        System.out.println("The result of f1.andThen(f2) :" +f1.andThen(f2).apply("GovindappaBarika"));
        System.out.println("The result of f1.compose(f2) :" +f1.compose(f2).apply("GovindappaBarika"));

        Function<Integer, Integer> f3 = i -> i+i;
        Function<Integer, Integer> f4 = i -> i*i*i;
        System.out.println(f3.andThen(f4).apply(2)); //64
        System.out.println(f3.compose(f4).apply(2)); //16
    }
}
