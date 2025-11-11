class Person {
    String name;
    int age;
    String gender;
    static int personCount = 0; 

    Person() {
        System.out.println("Person Default Constructor Called");
        this.name = "Yashraj";
        this.age = 22;
        this.gender = "Male";
        personCount++;
    }

    Person(String name, int age, String gender) {
        System.out.println("Person Parameterized Constructor Called");
        this.name = name;
        this.age = age;
        this.gender = gender;
        personCount++;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    static int getPersonCount() {
        return personCount;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}// person ends here


class Student1 extends Person {
    int rollNo;
    String course;
    String collegeName; 

    Student1() {
        super();
        System.out.println("Student Default Constructor Called");
        this.rollNo = 101;
        this.course = "Computer Science";
        this.collegeName = "TKIET Warananagar";
    }

    Student1(String name, int age, String gender, int roll, String course, String cName) {
        super(name, age, gender);
        System.out.println("Student Parameterized Constructor Called");
        this.rollNo = roll;
        this.course = course;
        this.collegeName = cName;
    }

    int getRollNo() {
        return rollNo;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    String getCourse() {
        return course;
    }

    void setCourse(String course) {
        this.course = course;
    }

    String getCollegeName() {
        return collegeName;
    }

    void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    void display() {
        super.display();
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Course: " + this.course);
        System.out.println("College: " + this.collegeName);
        System.out.println();
    }

}// student ends here


class Teacher extends Person {
    String subject;
    double salary;
    String schoolName = "Sevagiri Jr. College"; 

    Teacher() {
        super();
        System.out.println("Teacher Default Constructor Called");
        this.subject = "Math";
        this.salary = 50000;
        this.schoolName = "SGM College Karad"; 
    }

    Teacher(String name, int age, String gender, String sub, double sal, String sName) {
        super(name, age, gender);
        System.out.println("Teacher Parameterized Constructor Called");
        this.subject = sub;
        this.salary = sal;
        this.schoolName = sName;
    }

    String getSubject() {
        return subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getSchoolName() {
        return schoolName;
    }

    void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + this.subject);
        System.out.println("Salary: " + this.salary);
        System.out.println("School: " + this.schoolName);
        System.out.println();
    }

}// teacher ends here


class Doctor extends Person {
    String specialization;
    String hospital; 

    Doctor() {
        super();
        System.out.println("Doctor Default Constructor Called");
        this.specialization = "Cardiologist";
        this.hospital = "Balaji Hospital";
    }

    Doctor(String name, int age, String gender, String spec, String hosp) {
        super(name, age, gender);
        System.out.println("Doctor Parameterized Constructor Called");
        this.specialization = spec;
        this.hospital = hosp;
    }

    String getSpecialization() {
        return specialization;
    }

    void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    String getHospital() {
        return hospital;
    }

    void setHospital(String hospital) {
        this.hospital = hospital;
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + this.specialization);
        System.out.println("Hospital: " + this.hospital);
        System.out.println();
    }
}// doctor ends here


class PersonMain {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.display();

        Teacher t = new Teacher("Ravi", 40, "Male", "Science", 60000, "KBP College");
        t.display();

        Doctor d = new Doctor("Pooja", 35, "Female", "Dental", "KBP Dental Hospital");
        d.display();

        System.out.println("Total Person Count : " + Person.getPersonCount());
    }//main ends here
}// PersonMain ends here