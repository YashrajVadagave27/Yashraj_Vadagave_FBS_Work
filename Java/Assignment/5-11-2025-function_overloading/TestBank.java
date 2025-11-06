class Student {
    int rollno;
    String name;
    double percentage;

    void setStudent(int r, String n, double p) {
        rollno = r;
        name = n;
        percentage = p;
    }
} // Student ends here


class Employee {
    int id;
    String name;
    double annualSalary;

    void setEmployee(int i, String n, double s) {
        id = i;
        name = n;
        annualSalary = s;
    }
} // Employee ends here


class Bank {

    // Overloaded method for Student
    void approveLoan(Student s) {
        System.out.println("Loan Approval for Student: " + s.name);

        if (s.percentage > 80) {
            System.out.println("Approved Loan: ₹2,00,000");
        } else if (s.percentage >= 60 && s.percentage <= 80) {
            System.out.println("Approved Loan: ₹1,00,000");
        } else if (s.percentage >= 40 && s.percentage < 60) {
            System.out.println("Approved Loan: ₹50,000");
        } else {
            System.out.println("No loan approved.");
        }
       
    }

    // Overloaded method for Employee
    void approveLoan(Employee e) {
        System.out.println("Loan Approval for Employee: " + e.name);

        if (e.annualSalary > 12) {
            System.out.println("Approved Loan: ₹7,00,000");
        } else if (e.annualSalary >= 10 && e.annualSalary <= 12) {
            System.out.println("Approved Loan: ₹6,00,000");
        } else if (e.annualSalary >= 6 && e.annualSalary < 10) {
            System.out.println("Approved Loan: ₹5,00,000");
        } else if (e.annualSalary >= 4 && e.annualSalary < 6) {
            System.out.println("Approved Loan: ₹4,00,000");
        } else {
            System.out.println("No loan approved.");
        }
      
    }
} // Bank ends here


class TestBank {
    public static void main(String[] args) {

        // Create Student objects
        Student s1 = new Student();
        s1.setStudent(101, "Yash", 85);

        Student s2 = new Student();
        s2.setStudent(102, "Aditi", 58);

        // Create Employee objects
        Employee e1 = new Employee();
        e1.setEmployee(201, "Rahul", 11);

        Employee e2 = new Employee();
        e2.setEmployee(202, "Priya", 3.5);

        // Create Bank object
        Bank bank = new Bank();

        // Approve loans
        bank.approveLoan(s1);
        bank.approveLoan(s2);
        bank.approveLoan(e1);
        bank.approveLoan(e2);
    } // main ends here
} // TestBank ends here
