package Practical7p2.Q3;

import java.util.ArrayList;

public class Company {
    String companyName, location;
    ArrayList<Employee> employees = new ArrayList<>();

    Company(String companyName, String location, ArrayList<Employee> employees) {
        this.companyName = companyName;
        this.location = location;
        this.employees = employees;
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void removeEmployee(Employee employee) {
        boolean found = true;
        for (Employee e : employees) {
            if (e.name == employee.name) {
                employees.remove(employee);
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid choice!!");
        }
    }

    void displayEmployees() {
    for(Employee e : employees){
        e.displayEmployeeDetails();
    }
    }

    double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee e : employees) {
            totalSalary += e.salary;
        }
        return totalSalary;
    }
}