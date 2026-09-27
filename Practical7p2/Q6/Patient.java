package Practical7p2.Q6;

public class Patient {
    private String patientId;
    private String patientName;
    private int age;
    private String disease;

    public Patient(String patientId, String patientName, int age, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    public void displayPatientDetails() {
        System.out.println("  Patient ID   : " + patientId);
        System.out.println("  Patient Name : " + patientName);
        System.out.println("  Age          : " + age);
        System.out.println("  Disease      : " + disease);
    }

    public void showMedicalStatus() {
        System.out.println(patientName + " is currently suffering from " + disease + ".");
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Patient other = (Patient) obj;
        return patientId.equals(other.patientId);
    }

    @Override
    public int hashCode() {
        return patientId.hashCode();
    }
}
