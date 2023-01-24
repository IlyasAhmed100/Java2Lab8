public class Patient implements Comparable<Patient> {
    
    private String firstName;
    private String lastName;
    private String illness;
    private int illnessSeverity;



    public Patient(String firstName, String lastName, String illness, int illnessSeverity) {
        setFirstName(firstName);
        setLastName(lastName);
        setIllness(illness);
        setIllnessSeverity(illnessSeverity);
    }

    @Override
    public int compareTo(Patient otherPatient) {
        if (this.getIllnessSeverity() > otherPatient.getIllnessSeverity()) {
            return -1;
        } else if (this.getIllnessSeverity() == otherPatient.getIllnessSeverity()) {
            return 0;
        } else {
            return 1;
        }
    }

    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setIllnessSeverity(int illnessSeverity) {
        this.illnessSeverity = illnessSeverity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getIllness() {
        return illness;
    }


    public int getIllnessSeverity() {
        return illnessSeverity;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + ": " + getIllness() + " (Severity " + getIllnessSeverity() + ")";
    }

    
}
