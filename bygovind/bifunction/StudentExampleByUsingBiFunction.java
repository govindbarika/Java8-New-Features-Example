package com.example.demo.java8.newfeature.bygovind.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class StudentExampleByUsingBiFunction {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        BiFunction<String, Integer, Student> biFunction = (s, i) -> new Student(s, i);
        students.add(biFunction.apply("Govind", 101));
        students.add(biFunction.apply("Suresh", 102));
        students.add(biFunction.apply("Ghouse", 103));

        for(Student s : students){
            System.out.println("Name : "+s.name + " " + "rollNumber :" + s.rollNo);
        }
    }
}

class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
