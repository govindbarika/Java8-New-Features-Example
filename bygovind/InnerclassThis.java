package com.example.demo.java8.newfeature.bygovind;


interface Interf1{
    public void m1();
}
public class InnerclassThis {
    int x =888;
    public static void main(String[] args) {
        InnerclassThis obj = new InnerclassThis();
        obj.m2();
    }

    public void m2(){
        /*Interf1 i = new Interf1() {
            int x = 999;
            @Override
            public void m1() {
                System.out.println(this.x);
                System.out.println(InnerclassThis.this.x);
            }
        };*/
        Interf1 i = ()-> {int x = 999;
            System.out.println(this.x);
        };
        i.m1();
    }
}
