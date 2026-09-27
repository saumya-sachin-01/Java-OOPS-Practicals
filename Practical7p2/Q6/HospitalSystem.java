package Practical7p2.Q6;

public class HospitalSystem {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("D001", "Anil Kapoor", "Cardiologist");
        Doctor d2 = new Doctor("D002", "Meera Nair", "Dermatologist");
        Doctor d3 = new Doctor("D003", "Sanjay Gupta", "Orthopedic");

        Patient p1 = new Patient("P001", "Rohan Sharma", 45, "Heart Problem");
        Patient p2 = new Patient("P002", "Priya Singh", 30, "Skin Allergy");
        Patient p3 = new Patient("P003", "Amit Joshi", 55, "Knee Pain");

        System.out.println("=========== DOCTOR DETAILS ===========");
        d1.displayDoctorDetails();
        System.out.println();
        d2.displayDoctorDetails();
        System.out.println();
        d3.displayDoctorDetails();

        System.out.println("\n=========== PATIENT DETAILS ===========");
        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();
        p3.displayPatientDetails();

        System.out.println("\n=========== MEDICAL STATUS ===========");
        p1.showMedicalStatus();
        p2.showMedicalStatus();
        p3.showMedicalStatus();

        System.out.println("\n=========== TREATMENT PROCESS ===========");
        d1.treatPatient(p1);
        d2.treatPatient(p2);
        d3.treatPatient(p3);

        System.out.println("\n=========== PRESCRIPTION ===========");
        d1.prescribeMedicine(p1, "Aspirin");
        d2.prescribeMedicine(p2, "Cetirizine");
        d3.prescribeMedicine(p3, "Ibuprofen");

        System.out.println("\n=========== SAME PATIENT VISITS ANOTHER DOCTOR ===========");
        d3.treatPatient(p1);
        d3.prescribeMedicine(p1, "Physiotherapy");
    }
}