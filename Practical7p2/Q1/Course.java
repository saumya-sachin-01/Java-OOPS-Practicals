package Practical7p2.Q1;

public class Course {
    int courseId;
    String courseName;
    double credits;

    Course(int courseId, String courseName,
           double credits) {
        this.courseId=courseId;
        this.courseName=courseName;
        this.credits=credits;
    }

    void displayCourseDetails() {
        System.out.println("Course Id = "+courseId);
        System.out.println("Course Name = "+courseName);
        System.out.println("Credits = "+credits);
    }
}
