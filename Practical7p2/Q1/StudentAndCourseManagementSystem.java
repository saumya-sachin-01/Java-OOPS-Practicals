package Practical7p2.Q1;

import java.util.ArrayList;

public class StudentAndCourseManagementSystem {
    static void main() {
        ArrayList <Course> courses1 = new ArrayList<>();
        ArrayList <Course> courses2 = new ArrayList<>();

        student s1 = new student(123, "Ram", "abc@gmail.com",courses1);
        student s2 = new student(132, "Mohan", "acd@gmail.com",courses2);

        Course CSE = new Course(1, "CSE", 10);
        Course BDA = new Course(2, "BDA", 10);
        Course AIML = new Course(3, "AIML", 10);

        s1.enrollCourse(CSE);
        s1.enrollCourse(BDA);
        s1.enrollCourse(AIML);

        s2.enrollCourse(CSE);
        s2.enrollCourse(AIML);

        s1.displayEnrolledCourses();
        s2.displayEnrolledCourses();
    }
}
