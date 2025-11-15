class Employee extends Object{
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
    
    public String toString() {
    	return "\nID : "+this.id+"\nName : "+this.name+"\nSalary : "+this.salary;
    }
} // Employee class ends here


class TestEmp {
    public static void main(String[] args) {
    	Object e = new Employee();
    	
    	System.out.println(e);
    	System.out.println(e.toString());
   
    } // main ends here
} // TestEmp ends here
