package com.example.demo.java8.newfeature.bygovind.streams;

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        Stream<Integer> values = Stream.of(1, 11, 111, 1111, 11111);
        values.forEach(System.out::println);

        Double[] doubles = {10.1, 10.2, 10.3, 10.4, 10.5};
        Stream<Double> doubleStream = Stream.of(doubles);
        doubleStream.forEach(System.out::println);
    }
}
