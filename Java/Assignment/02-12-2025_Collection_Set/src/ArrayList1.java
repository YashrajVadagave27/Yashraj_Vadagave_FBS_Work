import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee1 {
    int id;
    String name;
    double salary;

    public Employee1() {
        this.id = 101;
        this.name = "Yashraj";
        this.salary = 10000;
    }

    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

// -------------------- Comparators --------------------

class MyIdComparator implements Comparator<Employee1> {
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.id - e2.id;
    }
}

class MyNameComparator implements Comparator<Employee1> {
    public int compare(Employee1 e1, Employee1 e2) {
        return e1.name.compareTo(e2.name);
    }
}

class MySalaryComparator implements Comparator<Employee1> {
    public int compare(Employee1 e1, Employee1 e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}

// -------------------- MAIN CLASS --------------------

public class ArrayList1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1(103, "Raj", 50000);
        Employee1 e3 = new Employee1(102, "Yash", 60000);

        ArrayList<Employee1> a1 = new ArrayList<>();
        a1.add(e1);
        a1.add(e2);
        a1.add(e3);

        System.out.println("Before Sorting:");
        System.out.println(a1);

        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Sort By ID");
            System.out.println("2. Sort By Name");
            System.out.println("3. Sort By Salary");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Collections.sort(a1, new MyIdComparator());
                    System.out.println("\nAfter Sorting by ID:");
                    System.out.println(a1);
                    break;

                case 2:
                    Collections.sort(a1, new MyNameComparator());
                    System.out.println("\nAfter Sorting by Name:");
                    System.out.println(a1);
                    break;

                case 3:
                    Collections.sort(a1, new MySalaryComparator());
                    System.out.println("\nAfter Sorting by Salary:");
                    System.out.println(a1);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input, try again!");
            }
        }
    }
}
