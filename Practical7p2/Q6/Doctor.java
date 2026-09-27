package Practical7p2.Q6;

public class Doctor {
    private String doctorId;
    private String doctorName;
    private String specialization;

    public Doctor(String doctorId, String doctorName, String specialization) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void displayDoctorDetails() {
        System.out.println("  Doctor ID      : " + doctorId);
        System.out.println("  Doctor Name    : " + doctorName);
        System.out.println("  Specialization : " + specialization);
    }

    public void treatPatient(Patient patient) {
        if (patient == null) {
            System.out.println("Cannot treat a null patient.");
            return;
        }
        System.out.println("Dr. " + doctorName + " (" + specialization + ") is treating "
                + patient.getPatientName() + " for " + patient.getDisease() + ".");
    }

    public void prescribeMedicine(Patient patient, String medicine) {
        if (patient == null) {
            System.out.println("Cannot prescribe medicine to a null patient.");
            return;
        }
        System.out.println("Dr. " + doctorName + " prescribed " + medicine
                + " to " + patient.getPatientName() + ".");
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }
}