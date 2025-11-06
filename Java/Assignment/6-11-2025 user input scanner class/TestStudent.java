import java.util.Scanner;
class Student {
    int rollno, marks;
    String name;

    // Default Constructor
    Student() {
        System.out.println("Default Constructor called");
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
	Scanner sc = new Scanner(System.in);
	
        Student s1 = new Student();  // Calls default constructor
        s1.display();
	
	System.out.println("Enter Roll No: ");
	int a = sc.nextInt();

	System.out.println("Enter Marks: ");
	int b = sc.nextInt();

	sc.nextLine();
	System.out.println("Enter Name: ");
	String c = sc.nextLine();

        Student s2 = new Student(a, b, c);  // Calls parameterized constructor
        s2.display();
	
	System.out.println("Enter Roll No: ");
	int a11 = sc.nextInt();

	System.out.println("Enter Marks: ");
	int b11 = sc.nextInt();

	sc.nextLine();
	System.out.println("Enter Name: ");
	String c11 = sc.nextLine();

	s1.setRollno(a11);
	s1.setMarks(b11);
	s1.setName(c11);
	s1.display();
    } // main ends here
} // TestStudent ends here
