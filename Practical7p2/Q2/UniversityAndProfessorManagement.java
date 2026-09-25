package Practical7p2.Q2;

import java.util.ArrayList;

public class UniversityAndProfessorManagement {
    static void main() {

        Professor p1 = new Professor("1", "Ram", "Maths", 100000);
        Professor p2 = new Professor("2", "Shyam", "Computer Science", 150000);
        Professor p3 = new Professor("3", "Mohan", "Physics", 200000);
        Professor p4 = new Professor("4", "Sohan", "Chemistry", 1250000);
        ArrayList<Professor> professors = new ArrayList<>();
        professors.add(p1);
        professors.add(p2);
        professors.add(p3);
        professors.add(p4);
        for(Professor p : professors){
            p.displayProfessorDetails();
        }
        ArrayList<Professor> professors1 = new ArrayList<>();
        professors1.add(p1);
        professors1.add(p2);

        ArrayList<Professor> professors2 = new ArrayList<>();
        professors2.add(p3);
        professors2.add(p4);
        University u1 = new University("Ganpat University", "Gujarat", professors1);
        u1.displayProfessors();

        University u2 = new University("XYZ University", "Gujarat", professors2);
        u2.displayProfessors();
    }
}
