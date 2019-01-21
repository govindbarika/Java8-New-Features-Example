package com.example.demo.java8.newfeature.bygovind.methodreference;

public class ThreadExample {
    public static void main(String[] args) {
        ThreadExample obj = new ThreadExample();
        Runnable r = obj::m1;
        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }

    public void m1(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
