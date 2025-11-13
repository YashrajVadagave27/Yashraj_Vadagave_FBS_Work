class Employee {
    int empId;
    String empName;
    double salary;
    static int count = 0;

    Employee() {
        System.out.println("Employee Default Constructor Called");
        this.empId = 101;
        this.empName = "Yashraj";
        this.salary = 50000;
        count++;
    }

    Employee(int id, String name, double sal) {
        System.out.println("Employee Parameterized Constructor Called");
        this.empId = id;
        this.empName = name;
        this.salary = sal;
        count++;
    }

    int getEmpId() { 
    	return empId; 
    }
    void setEmpId(int empId) { 
    	this.empId = empId; 
    }

    String getEmpName() { 
    	return empName; 
    }
    void setEmpName(String empName) { 
    	this.empName = empName; 
    }

    double getSalary() { 
    	return salary; 
    }
    void setSalary(double salary) { 
    	this.salary = salary; 
    }

    static int getCount() { 
    	return count; 
    }
    
    double calsal() {
    	return this.salary;
    }

    void display() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Basic Salary: " + this.salary);
        System.out.println();
    }
}//employee ends here

class HR extends Employee {
    int Commision;

    HR() {
        super();
        System.out.println("HR Default Constructor Called");
        this.Commision = 500;
    }

    HR(int id, String name, double sal,int com) {
        super(id, name, sal);
        System.out.println("HR Parameterized Constructor Called");
        this.Commision = com;
    }

	int getCommision() {
		return this.Commision;
	}

	void setCommision(int com) {
		this.Commision = com;
	}
	
	double calsal() {
    	return this.salary + this.Commision;
    }
	
	void display() {
        super.display();
        System.out.println("Commision: " + this.Commision);
        System.out.println();
    }
}//hr ends here

class Admin extends Employee {
    int allowance;

    Admin() {
        super();
        System.out.println("Admin Default Constructor Called");
        this.allowance = 250;
    }

    Admin(int id, String name, double sal, int al) {
        super(id, name, sal);
        System.out.println("Admin Parameterized Constructor Called");
        this.allowance = al;
    }

    int getAllowance() {
		return this.allowance;
	}

	void setAllowance(int al) {
		this.allowance = al;
	}

	double calsal() {
    	return this.salary + this.allowance;
    }
	
	void display() {
        super.display();
        System.out.println("Allowance: " + this.allowance);
        System.out.println();
    }
}//admin ends here

class SalesManager extends Employee {
    double incentive;

    SalesManager() {
        super();
        System.out.println("SalesManager Default Constructor Called");
        this.incentive = 10000;
    }

    SalesManager(int id, String name, double sal, double incentive) {
        super(id, name, sal);
        System.out.println("SalesManager Parameterized Constructor Called");
        this.incentive = incentive;
    }

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	double calsal() {
    	return this.salary + this.incentive;
    }
	
	void display() {
        super.display();
        System.out.println("Incentive: " + this.incentive);
        System.out.println();
    }
}//salesmanager ends here

class NewEmployee {
    public static void main(String[] args) {
        Employee e1; //generic reference
        
        e1 = new Employee(1001, "abc", 10000);
        e1.display();	
        System.out.println("Total Salary: " + e1.calsal());
        System.out.println();

        e1 = new HR(1002, "xyz", 20000, 500); //upcasting
        e1.display();
        System.out.println("Total Salary: " + e1.calsal());
        System.out.println();

        e1 = new Admin(1003, "pqr", 25000, 1000);
        e1.display();
        System.out.println("Total Salary: " + e1.calsal());
        System.out.println();

        e1 = new SalesManager(1004, "lmn", 30000, 2000);
        e1.display();
        System.out.println("Total Salary: " + e1.calsal());
        System.out.println();

        System.out.println("Total Employees: " + Employee.getCount());
    } //main ends here
} //employeemain ends here
