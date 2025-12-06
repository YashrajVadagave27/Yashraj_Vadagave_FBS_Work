package Controller;

import java.util.ArrayList;

import Model.Employee;
import Model.Admin;
import Model.HR;
import Model.SalesManager;

public class EmployeeDAO   // Data Access Object
{
    static ArrayList<Employee> eArr = new ArrayList<>();

    static {
        eArr.add(new HR(101, "Ranjit", 50000, 5000));
        eArr.add(new HR(102, "Amit", 48000, 4500));
        eArr.add(new HR(103, "Sneha", 47000, 4000));
        eArr.add(new SalesManager(201, "Karan", 60000, 12, 8000));
        eArr.add(new SalesManager(202, "Meena", 58000, 15, 7500));
        eArr.add(new SalesManager(203, "Rohit", 62000, 10, 9000));
        eArr.add(new Admin(301, "Pragati", 70000, 10000));
        eArr.add(new Admin(302, "Isha", 68000, 9500));
        eArr.add(new Admin(303, "Pooja", 72000, 11000));
        eArr.add(new Admin(304, "Shubham", 75000, 12000));
    }

    public boolean addEmployee(Employee e) {
        return eArr.add(e);
    }

    public Employee searchEmployee(int id) {
        for (Employee emp : eArr) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public boolean updateEmployee(int id, double salary) {
        for (Employee emp : eArr) {
            if (emp.getId() == id) {
                emp.setSalary(salary);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        for (Employee emp : eArr) {
            if (emp.getId() == id) {
                eArr.remove(emp);   // ArrayList removes & shifts automatically
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (Employee emp : eArr) {
            System.out.println(emp);
        }
    }
}
