class Student extends Object{
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
    
    public String toString() {
    	return "\nRoll No : "+this.rollno+"\nName : "+this.name+"\nMarks : "+this.marks;
    }
    
} // Student class ends here


class TestStudent {
    public static void main(String[] args) {
    	Object c = new Complex();
    	
    	System.out.println(c);
    	System.out.println(c.toString());
    	
    } // main ends here
} // TestStudent ends here
