package Practical7p2.Q2;

import java.util.ArrayList;

public class University {
    String universityName, location;
    ArrayList<Professor> Professors = new ArrayList<>();
    University(String universityName,String location,ArrayList<Professor> professors){
        this.universityName = universityName;
        this.location = location;
        this.Professors = new ArrayList<>(professors);
    }
    void addProfessor(Professor professor) {
        Professors.add(professor);
    }

    void displayProfessors() {
        System.out.println("---------- University Details ----------");
        System.out.println("University Name = "+universityName);
        System.out.println("Location = "+location);
        System.out.println("---------------------------------------");
        System.out.println("---------- Professor Details ----------");
        for(Professor p : Professors){

           p.displayProfessorDetails();

        }
    }
}
