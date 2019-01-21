package com.example.demo.java8.newfeature.bygovind.methodreference;

interface Interf{
    public void m1();
}
public class MethodReferenceExample {
    public static void m2() {
        System.out.println("Method Reference");
    }
    public static void main(String[] args) {
        Interf i =  MethodReferenceExample::m2;
        i.m1();
    }
}