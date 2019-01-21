package com.example.demo.java8.newfeature.bygovind.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



public class DisplayStudentInfoUsingPredicateFunctionConsumer {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        populateStudents(students);
        Function<Student, String> gradeFunction = student -> {
            if(student.marks >= 80){
                return "A[Distinction]";
            } else if(student.marks >= 60){
                return "B[First Class]";
            } else if (student.marks >= 50){
                return "C[Second Class]";
            } else if (student.marks >= 35){
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }
        };

        Predicate<Student> p = student -> student.marks>=60;
        Consumer<Student> c = s -> {
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("Grade: " + gradeFunction.apply(s));
            System.out.println();
        };

        for(Student s : students){
            if(p.test(s)) {
                c.accept(s);
            }
        }
    }
    public static void populateStudents(List<Student> students){
        students.add(new Student("Govind", 75));
        students.add(new Student("Raju", 60));
        students.add(new Student("Suresh", 90));
        students.add(new Student("Ghouse", 52));
        students.add(new Student("Ali", 20));
        students.add(new Student("Bujji", 45));
        students.add(new Student("Ali", 40));
    }
}

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}