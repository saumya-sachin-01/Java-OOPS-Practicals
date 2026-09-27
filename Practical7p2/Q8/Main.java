package Practical7p2.Q8;

public class Main {
    public static void main(String[] args) {

        College college = new College("ABC College", "Pune");

        Department d1 = new Department("D01", "Computer Science");
        Department d2 = new Department("D02", "Mechanical");

        Teacher t1 = new Teacher("T01", "Mr. Sharma", "Java");
        Teacher t2 = new Teacher("T02", "Ms. Kulkarni", "DBMS");
        Teacher t3 = new Teacher("T03", "Mr. Patil", "Thermodynamics");
        Teacher t4 = new Teacher("T04", "Ms. Joshi", "Networking");

        System.out.println("Adding Departments:");
        college.addDepartment(d1);
        college.addDepartment(d2);

        System.out.println();
        System.out.println("Adding Teachers to Departments:");
        d1.addTeacher(t1);
        d1.addTeacher(t2);
        d1.addTeacher(t4);

        d2.addTeacher(t3);

        college.displayDepartments();

        System.out.println();
        d1.displayTeachers();
        d2.displayTeachers();

        System.out.println();
        System.out.println("Conducting Class:");
        d1.conductClass(t1);
        d2.conductClass(t3);

        System.out.println();
        System.out.println("Conducting Exam:");
        d1.conductExam(t2);
        d2.conductExam(t3);

        System.out.println();
        System.out.println("Teacher works in another department (Aggregation):");
        d2.addTeacher(t1);
        d2.conductClass(t1);
    }
}
