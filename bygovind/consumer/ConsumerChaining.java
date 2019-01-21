package com.example.demo.java8.newfeature.bygovind.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Moviee> c1 = moviee -> System.out.println("Moviee "+ moviee.name +" is ready to release");
        Consumer<Moviee> c2 = moviee -> System.out.println("Moviee "+ moviee.name +" is "+moviee.result);
        Consumer<Moviee> c3 = moviee -> System.out.println("Moviee "+ moviee.name +" is stored in to DB");
        Consumer<Moviee> chaninedConsumer = c1.andThen(c2).andThen(c3);
        chaninedConsumer.accept(new Moviee("Spider", "Flop"));
        System.out.println();
        c1.andThen(c2).andThen(c3).accept(new Moviee("Bahubali", "Hit"));
    }
}

class Moviee {
    String name;
    String result;

    public Moviee(String name, String result) {
        this.name = name;
        this.result = result;
    }
}
