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
	Student[] stud = new Student[3];
        stud[0] = new Student();  
      	stud[1] = new Student(2, 92, "Rohit");
	stud[2] = new Student();
       	for(int i=0;i<stud.length;i++)
	{
		stud[i].display();
	}
    } // main ends here
} // TestStudent ends here
