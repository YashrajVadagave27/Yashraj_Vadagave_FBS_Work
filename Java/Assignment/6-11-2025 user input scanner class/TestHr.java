import java.util.Scanner;

class HR {
    int id;
    String name;
    double salary;
    double commission;

    // Default Constructor
    HR() {
        System.out.println("Constructor called");
        this.id = 101;
        this.name = "Sandip";
        this.salary = 20000.0;
        this.commission = 12.3;
    }

    // Parameterized Constructor
    HR(int i, String n, double s, double c) {
        System.out.println("Parameterized constructor called");
        this.id = i;
        this.name = n;
        this.salary = s;
        this.commission = c;
    }

    // Setter Methods
    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setCommission(double c) {
        this.commission = c;
    }

    // Getter Methods
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    double getCommission() {
        return this.commission;
    }

    // Display Method
    void display() {
        System.out.println("\nHR Details:");
        System.out.println("ID          : " + getId());
        System.out.println("Name        : " + getName());
        System.out.println("Salary      : " + getSalary());
        System.out.println("Commission  : " + getCommission());
    }
} // HR class ends here


class TestHr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor call
        HR h1 = new HR();
        h1.display();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Commission: ");
        double commission = sc.nextDouble();

        HR h2 = new HR(id, name, salary, commission);
        h2.display();

        
    } // main ends here
} // TestHr ends here
