package week7_encap;
class BloodData {
    private String bloodType;
    private String rhFactor;
    private String patientName;
    
    public BloodData() {
        patientName = "none";
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String pn, String bt, String rh) {
        patientName = pn;
        bloodType = bt;
        rhFactor = rh;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
