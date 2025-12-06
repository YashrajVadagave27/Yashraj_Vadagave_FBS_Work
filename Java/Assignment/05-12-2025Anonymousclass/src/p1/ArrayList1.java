package p1;

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

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class ArrayList1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee1> a1 = new ArrayList<>();
        a1.add(new Employee1());
        a1.add(new Employee1(103, "Raj", 50000));
        a1.add(new Employee1(102, "Yash", 60000));

        while (true) {

            System.out.println("\n----Menu----");
            System.out.println("1. Sort Based on ID");
            System.out.println("2. Sort Based on NAME");
            System.out.println("3. Sort Based on SALARY");
            System.out.println("4. EXIT");
            System.out.print("Enter Your Choice : ");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                System.out.println("Sorting based on ID...");
                Collections.sort(a1, new Comparator<Employee1>() {
                    public int compare(Employee1 o1, Employee1 o2) {
                        return o1.getId() - o2.getId();
                    }
                });
                System.out.println(a1);
                break;

            case 2:
                System.out.println("Sorting based on NAME...");
                Collections.sort(a1, new Comparator<Employee1>() {
                    public int compare(Employee1 o1, Employee1 o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                System.out.println(a1);
                break;

            case 3:
                System.out.println("Sorting based on SALARY...");
                Collections.sort(a1, new Comparator<Employee1>() {
                    public int compare(Employee1 o1, Employee1 o2) {
                        return Double.compare(o1.getSalary(), o2.getSalary());
                    }
                });
                System.out.println(a1);
                break;

            case 4:
                System.out.println("Exiting From Program...");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
