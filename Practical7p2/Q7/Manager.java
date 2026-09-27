package Practical7p2.Q7;

public class Manager extends Employee {
    private int teamSize;
    private String department;

    public Manager(String name, int age, String employeeId, double salary,
                   int teamSize, String department) {
        super(name, age, employeeId, salary);
        this.teamSize = teamSize;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the " + department
                + " department with a team of " + teamSize + " members.");
    }

    public void displayManagerDetails() {
        System.out.println("\n=========== MANAGER DETAILS ===========");
        displayPersonDetails();
        System.out.println("  Employee ID : " + getEmployeeId());
        System.out.println("  Salary      : " + getSalary());
        System.out.println("  Team Size   : " + teamSize);
        System.out.println("  Department  : " + department);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String getDepartment() {
        return department;
    }
}