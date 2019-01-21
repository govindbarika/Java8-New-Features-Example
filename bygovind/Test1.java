package com.example.demo.java8.newfeature.bygovind;

interface Interf6{
    public static void m1(){
        System.out.println("Interface static methods");
    }
}
public class Test1 implements Interf6 {
    public void m1(){
        System.out.println("child class methods");
    }
}
