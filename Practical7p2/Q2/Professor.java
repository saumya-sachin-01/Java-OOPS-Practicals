package Practical7p2.Q2;

import java.util.ArrayList;

public class Professor {
    String professorId, name, subject;
    double salary;
Professor(){

}
    Professor(String professorId, String name, String subject, double salary) {
        this.professorId = professorId;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    void displayProfessorDetails() {
        System.out.println("---------------------------------");
        System.out.println("Professor Id = " + professorId);
        System.out.println("Professor Name = " + name);
        System.out.println("Subject = " + subject);
        System.out.println("Salary = " + salary);
    }

    void teach() {
        System.out.println("Professor " + name + " teaches " + subject);
    }
}
