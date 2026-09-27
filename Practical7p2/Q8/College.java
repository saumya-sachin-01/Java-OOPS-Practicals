package Practical7p2.Q8;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String collegeName;
    private String location;
    private List<Department> departments;

    public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        if (department == null) {
            System.out.println("Cannot add a null department.");
            return;
        }
        if (departments.contains(department)) {
            System.out.println(department.getDepartmentName() + " is already in " + collegeName + ".");
            return;
        }
        departments.add(department);
        System.out.println(department.getDepartmentName() + " department added to " + collegeName + ".");
    }

    public void displayDepartments() {
        System.out.println("\nDepartments in " + collegeName + " (" + location + "):");
        if (departments.isEmpty()) {
            System.out.println("  No departments currently.");
            return;
        }
        for (Department d : departments) {
            d.displayDepartmentDetails();
            System.out.println("  ---------------------------");
        }
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getLocation() {
        return location;
    }
}