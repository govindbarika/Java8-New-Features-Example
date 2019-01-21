package com.example.demo.java8.newfeature.bygovind.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TotalSalOfEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateEmployees(employees);
        Function<List<Employee>, Double> f = al -> {
            double total =0;
            for (Employee e:employees){
                total+=e.salary;
            }
            return total;
        };

        System.out.println("Total Salary :" + f.apply(employees));
    }
    public static void populateEmployees(List<Employee> employees){
        employees.add(new Employee("Govind", 1000));
        employees.add(new Employee("Suresh", 2000));
        employees.add(new Employee("Raju", 3000));
        employees.add(new Employee("Manju", 4000));
        employees.add(new Employee("Ghouse", 5000));
    }
}

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+ " : "+ salary;
    }
}