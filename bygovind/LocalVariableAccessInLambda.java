package com.example.demo.java8.newfeature.bygovind;

interface Interf2{
    public void m1();
}
public class LocalVariableAccessInLambda {
    int x = 10;
    public static void main(String[] args) {
        LocalVariableAccessInLambda obj = new LocalVariableAccessInLambda();
        obj.m2();
    }

    public void m2(){
        int y = 20;
        Interf2 i = ()-> {
            x = 888;
            //y = 999;
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }
}
