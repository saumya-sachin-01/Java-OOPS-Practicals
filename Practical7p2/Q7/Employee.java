package Practical7p2.Q7;

public class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void work() {
        System.out.println(getName() + " is working as an employee.");
    }

    public void displayEmployeeDetails() {
        System.out.println("\n=========== EMPLOYEE DETAILS ===========");
        displayPersonDetails();
        System.out.println("  Employee ID : " + employeeId);
        System.out.println("  Salary      : " + salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}
