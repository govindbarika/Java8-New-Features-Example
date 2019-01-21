package com.example.demo.java8.newfeature.bygovind;

interface Interf3{
    default void m1(){
        System.out.println("Interface default method");
    }
}
public class DefaultMethodInInterface implements Interf3 {
    public static void main(String[] args) {
        DefaultMethodInInterface obj = new DefaultMethodInInterface();
        obj.m1();
    }

    @Override
    public void m1() {
        System.out.println("default method is implemented in child class");
    }
}
