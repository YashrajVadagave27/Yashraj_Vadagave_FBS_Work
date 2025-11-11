class Institution {
    String institutionName;
    String location;
    int establishedYear;

    Institution() {
        this.institutionName = "Global Education Center";
        this.location = "Pune";
        this.establishedYear = 1995;
    }

    Institution(String institutionName, String location, int establishedYear) {
        this.institutionName = institutionName;
        this.location = location;
        this.establishedYear = establishedYear;
    }

    void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    String getInstitutionName() {
        return this.institutionName;
    }

    String getLocation() {
        return this.location;
    }

    int getEstablishedYear() {
        return this.establishedYear;
    }

    void display() {
        System.out.println("Institution Name: " + this.institutionName);
        System.out.println("Location: " + this.location);
        System.out.println("Established Year: " + this.establishedYear);
    }
}//institution ends here

class School extends Institution {
    String schoolBoard;
    int noOfStudents;
    int noOfTeachers;

    School() {
        super();
        this.schoolBoard = "CBSE";
        this.noOfStudents = 1200;
        this.noOfTeachers = 80;
    }

    School(String institutionName, String location, int establishedYear,
           String schoolBoard, int noOfStudents, int noOfTeachers) {
        super(institutionName, location, establishedYear);
        this.schoolBoard = schoolBoard;
        this.noOfStudents = noOfStudents;
        this.noOfTeachers = noOfTeachers;
    }

    void setSchoolBoard(String schoolBoard) {
        this.schoolBoard = schoolBoard;
    }

    void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    void setNoOfTeachers(int noOfTeachers) {
        this.noOfTeachers = noOfTeachers;
    }

    String getSchoolBoard() {
        return this.schoolBoard;
    }

    int getNoOfStudents() {
        return this.noOfStudents;
    }

    int getNoOfTeachers() {
        return this.noOfTeachers;
    }

    // Display
    void display() {
        super.display();
        System.out.println("School Board: " + this.schoolBoard);
        System.out.println("No. of Students: " + this.noOfStudents);
        System.out.println("No. of Teachers: " + this.noOfTeachers);
        System.out.println("\n");
    }
}//school ends here

class College extends Institution {
    String principalName;
    int totalDepartments;
    String affiliation;

    College() {
        super();
        this.principalName = "Dr. Patel";
        this.totalDepartments = 6;
        this.affiliation = "SPPU";
    }

    College(String institutionName, String location, int establishedYear,
            String principalName, int totalDepartments, String affiliation) {
        super(institutionName, location, establishedYear);
        this.principalName = principalName;
        this.totalDepartments = totalDepartments;
        this.affiliation = affiliation;
    }

    void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    void setTotalDepartments(int totalDepartments) {
        this.totalDepartments = totalDepartments;
    }

    void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    String getPrincipalName() {
        return this.principalName;
    }

    int getTotalDepartments() {
        return this.totalDepartments;
    }

    String getAffiliation() {
        return this.affiliation;
    }

    void display() {
        super.display();
        System.out.println("Principal Name: " + this.principalName);
        System.out.println("Total Departments: " + this.totalDepartments);
        System.out.println("Affiliation: " + this.affiliation);
        System.out.println("\n");
    }
}//college ends here

class University extends Institution {
    int totalColleges;
    String chancellorName;
    String accreditationGrade;

    University() {
        super();
        this.totalColleges = 150;
        this.chancellorName = "Dr. Verma";
        this.accreditationGrade = "A+";
    }

    University(String institutionName, String location, int establishedYear,
               int totalColleges, String chancellorName, String accreditationGrade) {
        super(institutionName, location, establishedYear);
        this.totalColleges = totalColleges;
        this.chancellorName = chancellorName;
        this.accreditationGrade = accreditationGrade;
    }

    void setTotalColleges(int totalColleges) {
        this.totalColleges = totalColleges;
    }

    void setChancellorName(String chancellorName) {
        this.chancellorName = chancellorName;
    }

    void setAccreditationGrade(String accreditationGrade) {
        this.accreditationGrade = accreditationGrade;
    }

    int getTotalColleges() {
        return this.totalColleges;
    }

    String getChancellorName() {
        return this.chancellorName;
    }

    String getAccreditationGrade() {
        return this.accreditationGrade;
    }

    void display() {
        super.display();
        System.out.println("Total Colleges: " + this.totalColleges);
        System.out.println("Chancellor Name: " + this.chancellorName);
        System.out.println("Accreditation Grade: " + this.accreditationGrade);
    }
}//university ends here

class InstitutionMain {
    public static void main(String args[]) {

        School s1 = new School("Sunshine Public School", "Nagpur", 2005, "ICSE", 900, 65);
        s1.display();

        College c1 = new College("MIT College of Engineering", "Pune", 1998, "Dr. Deshmukh", 8, "SPPU");
        c1.display();

        University u1 = new University("Delhi University", "Delhi", 1922, 300, "Prof. R. Singh", "A++");
        u1.display();
    }//main ends here
}//institutionmain ends here
