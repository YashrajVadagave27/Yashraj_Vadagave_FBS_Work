import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Default Constructor
    Employee() {
        System.out.println("Constructor called");
        this.id = 1;
        this.name = "Yash";
        this.salary = 3000.0;
    }

    // Parameterized Constructor
    Employee(int i, String n, double s) {
        System.out.println("Parameterized constructor called");
        this.id = i;
        this.name = n;
        this.salary = s;
    }

    // Setter Methods
    void setId(int i) {
        this.id = i;
    }

    void setName(String str) {
        this.name = str;
    }

    void setSalary(double s) {
        this.salary = s;
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

    // Display Method
    void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID      : " + getId());
        System.out.println("Name    : " + getName());
        System.out.println("Salary  : " + getSalary());
    }
} // Employee class ends here


class TestEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor call
        Employee e1 = new Employee();
        e1.display();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e2 = new Employee(id, name, salary);
        e2.display();

        
    } // main ends here
} // TestEmp ends here
