class Employee {
    int id;
    String name;
    double salary;

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
        System.out.println("Employee Details:");
        System.out.println("ID      : " + getId());
        System.out.println("Name    : " + getName());
        System.out.println("Salary  : " + getSalary());
       
    }
} // Employee class ends here


class TestEmp {
    public static void main(String[] args) {
        // First employee
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Yash");
        e1.setSalary(3000.0);
        e1.display();

    } // main ends here
} // TestEmp ends here
