package com.example.demo.java8.newfeature.bygovind;

import java.util.function.Predicate;

public class PredicateIsEqualMethod {
    public static void main(String[] args) {
        Predicate<String> p = Predicate.isEqual("GovindSoftware");
        System.out.println(p.test("GovindSoftware")); //true
        System.out.println(p.test("RajuSoftware")); //false

        Predicate<Employee> govindSSE = Predicate.isEqual(new Employee("Govind", "SSE", 10000, "Bengaluru"));
        Employee govindSSEEmployee = new Employee("Govind", "SSE", 10000, "Bengaluru");
        System.out.println(govindSSE.test(govindSSEEmployee)); //true
    }
}
