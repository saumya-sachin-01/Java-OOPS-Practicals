package Practical7p2.Q7;

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Ramesh Gupta", 40);
        Employee e = new Employee("Sita Verma", 28, "E001", 45000);
        Manager m = new Manager("Arjun Mehta", 35, "M001", 90000, 8, "IT");

        System.out.println("Person Details:");
        p.displayPersonDetails();

        e.displayEmployeeDetails();

        m.displayManagerDetails();

        System.out.println();
        System.out.println("Work Method:");

        e.work();
        m.work();

        System.out.println();
        System.out.println("Parent Child Check:");

        Person p1 = e;
        Person p2 = m;

        System.out.println(p1.getName() + " is a Person");
        System.out.println(p2.getName() + " is a Person");

        Employee e1 = m;
        System.out.println(e1.getName() + " is also an Employee, id = " + e1.getEmployeeId());
    }
}