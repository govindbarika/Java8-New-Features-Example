package com.example.demo.java8.newfeature.bygovind.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncremntByusingFunctionAndPredicate {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateEmployees(employees);
        System.out.println("Employees details before increment :" +employees);
        Predicate<Employee> p = emp -> emp.salary<=3500;
        Function<Employee, Employee> f = employee -> {
            employee.salary = employee.salary+555;
            return employee;
        };

        List<Employee> empGotIncrement = new ArrayList<>();
        for (Employee e : employees){
            if(p.test(e)){
                f.apply(e);
                empGotIncrement.add(e);
            }
        }
        System.out.println("Employees got Increment : "+ empGotIncrement);

    }
    public static void populateEmployees(List<Employee> employees){
        employees.add(new Employee("Govind", 1000));
        employees.add(new Employee("Suresh", 2000));
        employees.add(new Employee("Raju", 3000));
        employees.add(new Employee("Manju", 4000));
        employees.add(new Employee("Ghouse", 5000));
    }
}


/*class Employee{
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
}*/

