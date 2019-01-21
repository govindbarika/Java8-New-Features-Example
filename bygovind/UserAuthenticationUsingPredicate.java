package com.example.demo.java8.newfeature.bygovind;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthenticationUsingPredicate {
    public static void main(String[] args) {
        System.out.println("Enter User name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        User newuser = new User(name, password);

        Predicate<User> authorizedUser = user -> "govind".equals(user.getUserName()) && "java".equals(user.getPassWord());
        System.out.println(isAuthorizedUser(newuser, authorizedUser) ? "Vaild user" : "InValid User");
    }
    public static boolean isAuthorizedUser(User user, Predicate<User> predicate) {
        return predicate.test(user);
    }
}

class User{
    String userName;
    String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
