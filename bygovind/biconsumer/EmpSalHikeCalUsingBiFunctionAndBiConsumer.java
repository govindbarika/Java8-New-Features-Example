package com.example.demo.java8.newfeature.bygovind.biconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmpSalHikeCalUsingBiFunctionAndBiConsumer {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        BiFunction<String, Double, Employee> employeeBiFunction = (name, sal) -> new Employee(name, sal);
        employees.add(employeeBiFunction.apply("Govind", 1000.0));
        employees.add(employeeBiFunction.apply("Suresh", 2000.0));
        employees.add(employeeBiFunction.apply("Ghouse", 3000.0));
        employees.add(employeeBiFunction.apply("Raju", 4000.0));

        BiConsumer<Employee, Double> salIncrement = (emp, incrementAmt) -> emp.sal+=incrementAmt;
        for(Employee e: employees){
            salIncrement.accept(e, 555.0);
            System.out.println(e.name + ":" +e.sal);
        }
    }
}

class Employee{
    String name;
    double sal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }
}