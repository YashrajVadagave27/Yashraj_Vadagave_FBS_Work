class Hospital {
    String hospitalName;
    String location;
    int totalBeds;

    Hospital() {
        this.hospitalName = "City Care Hospital";
        this.location = "Pune";
        this.totalBeds = 100;
    }

    Hospital(String hospitalName, String location, int totalBeds) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.totalBeds = totalBeds;
    }

    void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
    }

    String getHospitalName() {
        return this.hospitalName;
    }

    String getLocation() {
        return this.location;
    }

    int getTotalBeds() {
        return this.totalBeds;
    }

    void display() {
        System.out.println("Hospital Name: " + this.hospitalName);
        System.out.println("Location: " + this.location);
        System.out.println("Total Beds: " + this.totalBeds);
    }
}//hospital ends here

class Doctor extends Hospital {
    String doctorName;
    String specialization;
    int experience;

    Doctor() {
        super();
        this.doctorName = "Dr. Mehta";
        this.specialization = "Cardiologist";
        this.experience = 10;
    }

    Doctor(String hospitalName, String location, int totalBeds,
           String doctorName, String specialization, int experience) {
        super(hospitalName, location, totalBeds);
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.experience = experience;
    }

    void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    void setExperience(int experience) {
        this.experience = experience;
    }

    String getDoctorName() {
        return this.doctorName;
    }

    String getSpecialization() {
        return this.specialization;
    }

    int getExperience() {
        return this.experience;
    }

    void display() {
        super.display();
        System.out.println("Doctor Name: " + this.doctorName);
        System.out.println("Specialization: " + this.specialization);
        System.out.println("Experience: " + this.experience + " years");
    }
}//doctor ends here

class Nurse extends Hospital {
    String nurseName;
    String shift;
    int dutyHours;

    Nurse() {
        super();
        this.nurseName = "Priya";
        this.shift = "Day";
        this.dutyHours = 8;
    }

    Nurse(String hospitalName, String location, int totalBeds,
          String nurseName, String shift, int dutyHours) {
        super(hospitalName, location, totalBeds);
        this.nurseName = nurseName;
        this.shift = shift;
        this.dutyHours = dutyHours;
    }

    void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    void setShift(String shift) {
        this.shift = shift;
    }

    void setDutyHours(int dutyHours) {
        this.dutyHours = dutyHours;
    }

    String getNurseName() {
        return this.nurseName;
    }

    String getShift() {
        return this.shift;
    }

    int getDutyHours() {
        return this.dutyHours;
    }

    void display() {
        super.display();
        System.out.println("Nurse Name: " + this.nurseName);
        System.out.println("Shift: " + this.shift);
        System.out.println("Duty Hours: " + this.dutyHours);
    }
}//nurse ends here

class Patient extends Hospital {
    String patientName;
    String disease;
    int roomNo;
    double billAmount;

    Patient() {
        super();
        this.patientName = "Amit";
        this.disease = "Fever";
        this.roomNo = 101;
        this.billAmount = 5000.0;
    }

    Patient(String hospitalName, String location, int totalBeds,
            String patientName, String disease, int roomNo, double billAmount) {
        super(hospitalName, location, totalBeds);
        this.patientName = patientName;
        this.disease = disease;
        this.roomNo = roomNo;
        this.billAmount = billAmount;
    }

    void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    void setDisease(String disease) {
        this.disease = disease;
    }

    void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    String getPatientName() {
        return this.patientName;
    }

    String getDisease() {
        return this.disease;
    }

    int getRoomNo() {
        return this.roomNo;
    }

    double getBillAmount() {
        return this.billAmount;
    }

    void display() {
        super.display();
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Disease: " + this.disease);
        System.out.println("Room No: " + this.roomNo);
        System.out.println("Bill Amount: ₹" + this.billAmount);
    }
}//patient ends here

class HospitalMain {
    public static void main(String args[]) {

        Doctor d1 = new Doctor("Apollo Hospital", "Mumbai", 250, "Dr. Sharma", "Neurologist", 12);
        d1.display();

        Nurse n1 = new Nurse("Fortis Hospital", "Delhi", 300, "Nikita", "Night", 10);
        n1.display();

        Patient p1 = new Patient("Ruby Hall", "Pune", 200, "Rahul", "Appendicitis", 305, 15000.0);
        p1.display();
    }//main ends here
}//hospitalmain ends here
