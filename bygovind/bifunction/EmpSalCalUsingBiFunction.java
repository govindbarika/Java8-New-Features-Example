package com.example.demo.java8.newfeature.bygovind.bifunction;

import java.util.function.BiFunction;

public class EmpSalCalUsingBiFunction {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Govind", 1000);
        TimeSheet t = new TimeSheet(101, 25);
        BiFunction<Employee, TimeSheet, Double> monthlySalary = (employee, timeSheet) -> e.dailyWage*t.daysWorked;
        System.out.println(monthlySalary.apply(e, t));
    }
}

class Employee {
    int empNo;
    String empName;
    double dailyWage;

    public Employee(int empNo, String empName, double dailyWage) {
        this.empNo = empNo;
        this.empName = empName;
        this.dailyWage = dailyWage;
    }
}

class TimeSheet{
    int empNo;
    int daysWorked;

    public TimeSheet(int empNo, int daysWorked) {
        this.empNo = empNo;
        this.daysWorked = daysWorked;
    }
}
