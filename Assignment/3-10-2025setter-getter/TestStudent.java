class Student {
    int rollno, marks;
    String name;

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
 
        Student s1 = new Student();
        s1.setRollno(1);
        s1.setMarks(87);
        s1.setName("Yash");
        s1.display();

    } // main ends here
} // TestStudent ends here
