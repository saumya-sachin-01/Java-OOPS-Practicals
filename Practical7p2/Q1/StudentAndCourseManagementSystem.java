package Practical7p2.Q1;

public class StudentAndCourseManagementSystem {
    static void main() {
        Course c[] = new Course[3];

        for (int i = 1; i <= 3; i++) {
            c[i] = new Course(123, "CSE", 5);
        }
        Student s[] = new Student[2];
        for(int i = 1;i<=2;i++){
            s[i] = new Student("123A","Saumya Sachin","25162201079@gnu.ac.in");

        }
    }
}
