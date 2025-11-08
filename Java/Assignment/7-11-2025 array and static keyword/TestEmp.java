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
        System.out.println("Employee Details:");
        System.out.println("ID      : " + getId());
        System.out.println("Name    : " + getName());
        System.out.println("Salary  : " + getSalary());
        
    }
} // Employee class ends here


class TestEmp {
    public static void main(String[] args) {
	Employee[] emp = new Employee[3];
        emp[0] = new Employee();  
      	emp[1] = new Employee(2, "Rohit", 4000.0);
	emp[2] = new Employee();
       	for(int i=0;i<emp.length;i++)
	{
		emp[i].display();
	}
    
    } // main ends here
} // TestEmp ends here
