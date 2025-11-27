import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {

    int age;
    String name;

    Person(String name, int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        }
        if (age > 150) {
            throw new InvalidAgeException("Age cannot be more than 150!");
        }

        this.name = name;
        this.age = age;
    }

    String checkEligibility() {
        if (age >= 18) {
            return "Eligible to Vote";
        } else {
            return "Not Eligible to Vote";
        }
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Status: " + checkEligibility());
    }
}

public class AgeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            Person p = new Person(name, age);

            System.out.println("\n--- Person Details ---");
            p.display();

        } catch (InvalidAgeException e) {
            System.out.println("\nError: " + e.getMessage());
        }
        finally {
            System.out.println("\nProgram Ends Successfully.");
        }
    }
}
