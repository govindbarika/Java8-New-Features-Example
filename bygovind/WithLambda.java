package com.example.demo.java8.newfeature.bygovind;
interface FInterf{
    public void m1();
}
public class WithLambda {
    public static void main(String[] args) {
        FInterf fi = () -> System.out.println("With Lambda Implementation");
        fi.m1();
    }
}
