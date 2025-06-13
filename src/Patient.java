package src;

public class Patient extends Person {
    private String medicalHistory;
    private String admissionDate;
    private String dischargeDate;

    public Patient(int id, String name, int age, String gender, String contact, 
                   String medicalHistory, String admissionDate, String dischargeDate) {
        super(id, name, age, gender, contact);
        this.medicalHistory = medicalHistory;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
    }

    public String getMedicalHistory() { return medicalHistory; }
    public String getAdmissionDate() { return admissionDate; }
    public String getDischargeDate() { return dischargeDate; }

    @Override
    public String toString() {
        return super.toString() + ", Medical History: " + medicalHistory +
               ", Admission Date: " + admissionDate + ", Discharge Date: " + dischargeDate;
    }
}

