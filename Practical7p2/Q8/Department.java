package Practical7p2.Q8;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentId;
    private String departmentName;
    private List<Teacher> teachers;

    public Department(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        if (teacher == null) {
            System.out.println("Cannot add a null teacher.");
            return;
        }
        if (teachers.contains(teacher)) {
            System.out.println(teacher.getTeacherName() + " is already in " + departmentName + " department.");
            return;
        }
        teachers.add(teacher);
        System.out.println(teacher.getTeacherName() + " added to " + departmentName + " department.");
    }

    public void conductClass(Teacher teacher) {
        if (teacher == null) {
            System.out.println("No teacher to conduct the class.");
            return;
        }
        System.out.println("Class conducted in " + departmentName + " department:");
        teacher.teach();
    }

    public void conductExam(Teacher teacher) {
        if (teacher == null) {
            System.out.println("No teacher to conduct the exam.");
            return;
        }
        System.out.println("Exam conducted in " + departmentName + " department:");
        teacher.conductExam();
    }

    public void displayTeachers() {
        System.out.println("Teachers in " + departmentName + " department:");
        if (teachers.isEmpty()) {
            System.out.println("  No teachers currently.");
            return;
        }
        for (Teacher t : teachers) {
            t.displayTeacherDetails();
            System.out.println("  ---------------------------");
        }
    }

    public void displayDepartmentDetails() {
        System.out.println("  Department ID   : " + departmentId);
        System.out.println("  Department Name : " + departmentName);
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}