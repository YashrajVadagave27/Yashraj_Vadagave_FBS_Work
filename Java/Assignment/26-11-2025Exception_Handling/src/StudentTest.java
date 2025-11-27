import java.util.Scanner;

// Custom Exception
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Student Class
class Student {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) throws InvalidMarksException {

        // Validate marks first
        if (marks < 0) {
            throw new InvalidMarksException("Marks are less than 0 → Invalid Marks.");
        }
        if (marks > 100) {
            throw new InvalidMarksException("Marks are greater than 100 → Invalid Marks.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    String getResult() {
    	if(marks < 35) {
    		return "Fail";
    	}
        if (marks >= 35 && marks <= 49) {
            return "Pass";
        } 
        else if (marks >= 50 && marks <= 59) {
            return "Second";
        } 
        else if (marks >= 60 && marks <= 74) {
            return "First";
        } 
        else {
            return "Distinction";
        }
    }

    // Display method
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("Result  : " + getResult());
    }
}

// Main Class
public class StudentTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int r = sc.nextInt();

            System.out.print("Enter Name: ");
            String n = sc.next();

            System.out.print("Enter Marks: ");
            int m = sc.nextInt();

            // Creating student object
            Student s = new Student(r, n, m);

            System.out.println("\n--- Student Details ---");
            s.display();

        } catch (InvalidMarksException e) { 
            System.out.println("\nError: " + e.getMessage());
        }
        finally {
        	System.out.println("Program Ends Successfully");
        }
    }
}
