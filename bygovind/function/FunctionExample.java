package com.example.demo.java8.newfeature.bygovind.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        String s = "Govind is a Software Engineer";
        Function<String, String> f = string -> string.replaceAll(" ", "");
        System.out.println(f.apply(s));    //GovindisaSoftwareEngineer

        //number of spaces in the string
        Function<String, Integer> numOfSpaces = str -> str.length() - str.replaceAll(" ", "").length();
        System.out.println(numOfSpaces.apply(s));    //4
    }
}
