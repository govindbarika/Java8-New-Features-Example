package com.example.demo.java8.newfeature.bygovind.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>  product = (a, b) -> a*b;
        System.out.println(product.apply(10, 20));
        System.out.println(product.apply(100, 200));
    }
}
