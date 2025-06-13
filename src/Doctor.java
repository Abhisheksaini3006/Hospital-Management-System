package src;


public class Doctor extends Person {
    private String specialization;
    private int experience;
    private String shiftTiming;

    public Doctor(int id, String name, int age, String gender, String contact, 
                  String specialization, int experience, String shiftTiming) {
        super(id, name, age, gender, contact);
        this.specialization = specialization;
        this.experience = experience;
        this.shiftTiming = shiftTiming;
    }

    public String getSpecialization() { return specialization; }
    public int getExperience() { return experience; }
    public String getShiftTiming() { return shiftTiming; }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization + 
               ", Experience: " + experience + " years, Shift Timing: " + shiftTiming;
    }
}
