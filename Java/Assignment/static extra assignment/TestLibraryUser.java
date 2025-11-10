import java.util.Scanner;

class LibraryUser {
    String name;
    int daysLate;
    static double finePerDay;

    // Static block
    static {
        finePerDay = 2.0;
    }

    // Default constructor
    LibraryUser() {
        this.name = "Yashraj";
        this.daysLate = 3;
    }

    // Parameterized constructor
    LibraryUser(String name, int days) {
        this.name = name;
        this.daysLate = days;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setDaysLate(int days) {
        this.daysLate = days;
    }

    static void setFinePerDay(double fine) {
        finePerDay = fine;
    }

    // Getters
    String getName() {
        return this.name;
    }

    int getDaysLate() {
        return this.daysLate;
    }

    double getFinePerDay() {
        return finePerDay;
    }

    double calculateFine() {
        return daysLate * finePerDay;
    }

    void display() {
        System.out.println("User Name: " + getName());
        System.out.println("Days Late: " + getDaysLate());
        System.out.println("Fine per Day: " + getFinePerDay());
        System.out.println("Total Fine: " + calculateFine());
    }
}//LibraryUser ends here

class TestLibraryUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Days Late: ");
        int days = sc.nextInt();

        System.out.println("\nDefault Constructor Output:");
        LibraryUser u1 = new LibraryUser();
        u1.display();

        System.out.println("\nParameterized Constructor Output:");
        LibraryUser u2 = new LibraryUser(name, days);
        u2.display();

        System.out.print("\nEnter User Name (Setter): ");
        String sname = sc.next();
        System.out.print("Enter Days Late (Setter): ");
        int sdays = sc.nextInt();

        System.out.println("\nSetter-Getter Output:");
        LibraryUser u3 = new LibraryUser();
        u3.setName(sname);
        u3.setDaysLate(sdays);
        u3.display();

        LibraryUser.setFinePerDay(10.0);
        System.out.println("\nAfter static function called (Fine Changed):");
        u3.display();
        u1.display();
        u2.display();
    }//main ends here
}//TestLibraryUser ends here
