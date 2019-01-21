package com.example.demo.java8.newfeature.bygovind;
interface Interf{
    public void m1();
}
class Demo implements Interf{
    @Override
    public void m1() {
        System.out.println("Normal Implementation");
    }
}
public class WithoutLambda {
    public static void main(String[] args) {
        Interf i = new Demo();
        i.m1();
    }
}
