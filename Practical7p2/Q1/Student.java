///..STUDENT & COURSE MANAGEMENT SYSTEM
//
//        Student & Course Management System
//
//        Problem Description
//
//        Required Classes
//
//        Design a Java application to manage students and courses in a college. A Student can enroll in multiple Course objects. A student and a course can exist independently. The system should demonstrate how two independent classes interact with each other.
//
//        Student
//
//        data members: studentId, studentName, email.
//        Methods: displayStudentDetails(), enrollCourse(Course course), displayEnrolledCourses().
//
//        Relationship & Tasks
//
//        Implement: Association between Student and Course.
//
//        Course
//
//        Create the required classes.
//        Create at least 3 Course objects and at least 2 Student objects.
//        Allow students to enroll in courses and display student and enrolled-course information.
//
//        data members: courseId, courseName, credits.
//        Method: displayCourseDetails().
//        ../
        package Practical7p2.Q1;
import java.util.*;

public class Student {
    String studentId;
    String studentName;
    String email;

    Student(String studentId,String studentName, String email) {
        this.studentId=studentId;
        this.studentName=studentName;
        this.email=email;
    }

    void displayStudentDetails() {
        System.out.println("Student Id = "+studentId);
        System.out.println("Student Name = "+studentName);
        System.out.println("Email = "+email);
    }

    void enrollCourse(Course course) {
        System.out.println("Enter Course Id = ");
        Scanner sc = new Scanner(System.in);
        String courseId = sc.next();
        System.out.println("Enter course name = ");
        String courseName = sc.next();
        System.out.println("Enter credits = ");
        int credits = sc.nextInt();
    }

    void displayEnrolledCourses() {

    }
}
