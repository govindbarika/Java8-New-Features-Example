package com.example.demo.java8.newfeature.bygovind;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateEmployeeList(employees);
        System.out.println("SSE employees");
        Predicate<Employee> sseEmployees = emp -> "SSE".equals(emp.designation);
        display(employees, sseEmployees);

        //lead employees
        Predicate<Employee> leads = emp -> "Lead".equals(emp.designation);
        System.out.println("Lead employees");
        display(employees, leads);

        //employees who is working in Bengaluru
        System.out.println("Employees working in Bengaluru location");
        Predicate<Employee> empInBengaluru = emp -> "Bengaluru".equals(emp.location);
        display(employees, empInBengaluru);

        //whose salary is greater than  or equal to 10000
        System.out.println("whose salary is greater than 10000");
        Predicate<Employee> result = emp -> emp.salary >= 10000;
        display(employees, result);

        //works in Hyd and sal > 20000
        System.out.println("works in Hyd and sal >= 20000");
        Predicate<Employee> empResult = emp -> "Hyderabad".equals(emp.location) && emp.salary>=20000;
        display(employees, empResult);

        //all SSE from bengaluru location
        System.out.println("SSE resources from Bengaluru");
        Predicate<Employee> sseFromBengaluru = sseEmployees.and(empInBengaluru);
        display(employees, sseFromBengaluru);

        //sse or sal >= 20000
        System.out.println("SSE resources or whose sal>=20000");
        Predicate<Employee> sseOrMoreSal = sseEmployees.or(empResult);
        display(employees, sseOrMoreSal);

        //employees who are not sse
        System.out.println("Employees other then SSE");
        Predicate<Employee> nonSSE = sseEmployees.negate();
        display(employees, nonSSE);
    }

    private static void populateEmployeeList(List<Employee> employees) {
        employees.add(new Employee("Govind", "SSE", 10000, "Bengaluru"));
        employees.add(new Employee("Suresh", "SSE", 20000, "Hyderabad"));
        employees.add(new Employee("Prashanth", "SE", 9000, "Hyderabad"));
        employees.add(new Employee("Raju", "CEO", 500000, "Bengaluru"));
        employees.add(new Employee("Hari", "Lead", 30000, "Chennai"));
        employees.add(new Employee("Manjeet", "Lead", 15000, "Bengaluru"));
    }

    private static void display(List<Employee> employees, Predicate<Employee> predicate){
        for(Employee emp:employees){
            if(predicate.test(emp)){
                System.out.println(emp);
            }
        }
    }
}
class Employee{
    String empName;
    String designation;
    double salary;
    String location;

    public Employee(String empName, String designation, double salary, String location) {
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format("Employee{ %s, %s, %.2f, %s} \n",  empName, designation, salary, location);
    }
}
