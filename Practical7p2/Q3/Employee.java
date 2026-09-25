package Practical7p2.Q3;

public class Employee {
    int employeeId;
    double salary;

    void displayEmployeeDetails() {
        System.out.println("---------------------------------------");
        System.out.println("Employee Id = "+employeeId);
        System.out.println("Salary = "+salary);
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    void work() {

    }
}
