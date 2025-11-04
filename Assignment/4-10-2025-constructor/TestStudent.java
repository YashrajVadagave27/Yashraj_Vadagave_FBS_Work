class Student {
    int rollno, marks;
    String name;

    // Default Constructor
    Student() {
        System.out.println("Constructor called");
        this.rollno = 1;
        this.marks = 87;
        this.name = "Yash";
    }

    // Parameterized Constructor
    Student(int r, int m, String n) {
        System.out.println("Parameterized constructor called");
        this.rollno = r;
        this.marks = m;
        this.name = n;
    }

    // Setter methods
    void setRollno(int r) {
        this.rollno = r;
    }

    void setMarks(int m) {
        this.marks = m;
    }

    void setName(String str) {
        this.name = str;
    }

    // Getter methods
    int getRollno() {
        return this.rollno;
    }

    int getMarks() {
        return this.marks;
    }

    String getName() {
        return this.name;
    }

    // Display method
    void display() {
        System.out.println("Roll No: " + getRollno());
        System.out.println("Marks: " + getMarks());
        System.out.println("Name: " + getName());
        
    }
} // Student class ends here


class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();  // Calls default constructor
        s1.display();

        Student s2 = new Student(2, 92, "Rohit");  // Calls parameterized constructor
        s2.display();
    } // main ends here
} // TestStudent ends here
