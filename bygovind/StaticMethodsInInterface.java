package com.example.demo.java8.newfeature.bygovind;

interface Interf5{
    public static void m1(){
        System.out.println("static method in interface");
    }
}
public class StaticMethodsInInterface {
    public static void main(String[] args) {
        StaticMethodsInInterface obj = new StaticMethodsInInterface();
        //obj.m1();     //CE: cannot resolve method m1
        //StaticMethodsInInterface.m1();  //CE:cannot resolve method m1
        Interf5.m1();
    }
}
