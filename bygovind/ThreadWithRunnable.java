package com.example.demo.java8.newfeature.bygovind;

class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<10;i++) {
            System.out.println("Child Thread");
        }
    }
}
public class ThreadWithRunnable {
    public static void main(String[] args) {
        Runnable r = new RunnableImpl();
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
