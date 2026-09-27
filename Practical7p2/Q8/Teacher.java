package Practical7p2.Q8;

public class Teacher {
    private String teacherId;
    private String teacherName;
    private String subject;

    public Teacher(String teacherId, String teacherName, String subject) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public void teach() {
        System.out.println(teacherName + " is teaching " + subject + ".");
    }

    public void conductExam() {
        System.out.println(teacherName + " is conducting the " + subject + " exam.");
    }

    public void displayTeacherDetails() {
        System.out.println("  Teacher ID   : " + teacherId);
        System.out.println("  Teacher Name : " + teacherName);
        System.out.println("  Subject      : " + subject);
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher other = (Teacher) obj;
        return teacherId.equals(other.teacherId);
    }

    @Override
    public int hashCode() {
        return teacherId.hashCode();
    }
}