package com.example.demo.java8.newfeature.bygovind.methodreference;

interface  NInterf{
    public Employee get();
}
class Employee{
    Employee(){
        System.out.println("Employee Object Creation");
    }
}
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        NInterf ni = Employee::new; //constructor reference
        //NInterf ni = () -> new Employee(); // Lambda implementation
        Employee e = ni.get();
    }
}
