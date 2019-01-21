package com.example.demo.java8.newfeature.bygovind.supplier;

import java.util.function.Supplier;

public class OTPGenerationUsingSupplier {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
                String otp = " ";
                for(int i=0;i<6;i++){
                    otp +=  (int)(Math.random()*10);
                }
                return otp;
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
