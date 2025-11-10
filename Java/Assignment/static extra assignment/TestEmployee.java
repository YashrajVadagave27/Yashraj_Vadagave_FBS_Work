import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;
    static double companyBonusRate;

    // Static block
    static {
        companyBonusRate = 10.0;
    }

    // Default constructor
    Employee() {
        this.name = "Yashraj";
        this.basicSalary = 30000.0;
    }

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.basicSalary = salary;
    }

    // Setters
    void setName(String name) {
        this.name = name;
    }

    void setBasicSalary(double salary) {
        this.basicSalary = salary;
    }

    static void setBonusRate(double rate) {
        companyBonusRate = rate;
    }

    // Getters
    String getName() {
        return this.name;
    }

    double getBasicSalary() {
        return this.basicSalary;
    }

    double getBonusRate() {
        return companyBonusRate;
    }

    double calculateTotalSalary() {
        return basicSalary + (basicSalary * companyBonusRate / 100);
    }

    void display() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Basic Salary: " + getBasicSalary());
        System.out.println("Bonus Rate: " + getBonusRate() + "%");
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}//Employee ends here

class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        System.out.println("\nDefault Constructor Output:");
        Employee e1 = new Employee();
        e1.display();

        System.out.println("\nParameterized Constructor Output:");
        Employee e2 = new Employee(name, salary);
        e2.display();

        System.out.print("\nEnter Employee Name (Setter): ");
        String sname = sc.next();
        System.out.print("Enter Basic Salary (Setter): ");
        double ssalary = sc.nextDouble();

        System.out.println("\nSetter-Getter Output:");
        Employee e3 = new Employee();
        e3.setName(sname);
        e3.setBasicSalary(ssalary);
        e3.display();

        Employee.setBonusRate(15.5);
        System.out.println("\nAfter static function called (Bonus Rate Changed):");
        e3.display();
        e1.display();
        e2.display();
    }//main ends here
}//TestEmployee ends here
