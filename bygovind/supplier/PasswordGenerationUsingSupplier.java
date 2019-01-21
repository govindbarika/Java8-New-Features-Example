package com.example.demo.java8.newfeature.bygovind.supplier;
/*Generate pwd:1. lenght should be 8
2.event positions should be digits from 0 to 9
3. odd positions should be uppercase alphabet characters and @#$*/
import java.util.function.Supplier;

public class PasswordGenerationUsingSupplier {
    public static void main(String[] args) {
        Supplier<String> pwd = () -> {
            String password = "";
            Supplier<Integer> d = () -> (int)(Math.random()*10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> c = () -> symbols.charAt((int)(Math.random()*29));
            for(int i=0;i<8;i++){
                if(i%2==0){
                    password+=d.get();
                } else {
                    password+=c.get();
                }
            }
            return password;

        };

        System.out.println(pwd.get());
    }
}
