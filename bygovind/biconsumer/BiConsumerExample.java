package com.example.demo.java8.newfeature.bygovind.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1+s2);
        biConsumer.accept("Govind ", "Barika");
    }
}
