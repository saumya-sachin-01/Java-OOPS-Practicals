package Practical7p2.Q1;
import java.util.*;

public class student {
    int studentId;
    String studentName;
    String email;
ArrayList <Course> courses;
    student(int studentId,String studentName, String email,ArrayList <Course> courses) {
        this.studentId=studentId;
        this.studentName=studentName;
        this.email=email;
        this.courses=courses;
    }

    void displayStudentDetails() {
        System.out.println("Student Id = "+studentId);
        System.out.println("Student Name = "+studentName);
        System.out.println("Email = "+email);
    }

    void enrollCourse(Course course) {
        courses.add(course);
    }

    void displayEnrolledCourses() {
        System.out.println("---------- Student Details -----------");
        System.out.println("Student Id = "+studentId);
        System.out.println("Student Name = "+studentName);
        System.out.println("Email = "+email);
        System.out.println("--------------------------------------");
        System.out.println("---------- Course Details ------------");
        for(Course c : courses){
            c = new Course(c.courseId,c.courseName,c.credits);
            System.out.println("Course Id = "+c.courseId);
            System.out.println("Course Name = "+c.courseName);
            System.out.println("Credits = "+c.credits);
            System.out.println("-----------------------------------");
        }

    }
}
