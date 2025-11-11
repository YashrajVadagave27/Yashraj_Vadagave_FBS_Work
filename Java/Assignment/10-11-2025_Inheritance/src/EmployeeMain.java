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

    void display() {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Salary: " + this.salary);
    }
}//employee ends here

class HR extends Employee {
    String department;
    int teamSize;

    HR() {
        super();
        System.out.println("HR Default Constructor Called");
        this.department = "Human Resources";
        this.teamSize = 5;
    }

    HR(int id, String name, double sal, String dept, int size) {
        super(id, name, sal);
        System.out.println("HR Parameterized Constructor Called");
        this.department = dept;
        this.teamSize = size;
    }
    
    String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	int getTeamSize() {
		return teamSize;
	}

	void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	void display() {
        super.display();
        System.out.println("Department: " + this.department);
        System.out.println("Team Size: " + this.teamSize);
        System.out.println();
    }
}//hr ends here

class Admin extends Employee {
    String location;
    String role;

    Admin() {
        super();
        System.out.println("Admin Default Constructor Called");
        this.location = "Pune";
        this.role = "System Administrator";
    }

    Admin(int id, String name, double sal, String loc, String role) {
        super(id, name, sal);
        System.out.println("Admin Parameterized Constructor Called");
        this.location = loc;
        this.role = role;
    }

    String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	String getRole() {
		return role;
	}

	void setRole(String role) {
		this.role = role;
	}

	void display() {
        super.display();
        System.out.println("Location: " + this.location);
        System.out.println("Role: " + this.role);
        System.out.println();
    }
}

class SalesManager extends Employee {
    String region;
    double incentive;

    SalesManager() {
        super();
        System.out.println("SalesManager Default Constructor Called");
        this.region = "West";
        this.incentive = 10000;
    }

    SalesManager(int id, String name, double sal, String region, double incentive) {
        super(id, name, sal);
        System.out.println("SalesManager Parameterized Constructor Called");
        this.region = region;
        this.incentive = incentive;
    }

    String getRegion() {
		return region;
	}

	void setRegion(String region) {
		this.region = region;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	void display() {
        super.display();
        System.out.println("Region: " + this.region);
        System.out.println("Incentive: " + this.incentive);
        System.out.println();
    }
}//salesmanager ends here

class EmployeeMain {
    public static void main(String[] args) {
        HR hr = new HR();
        hr.display();

        Admin ad = new Admin(102, "Raj", 60000, "Mumbai", "Network Admin");
        ad.display();

        SalesManager sm = new SalesManager(103, "Yash", 70000, "North", 12000);
        sm.display();

        System.out.println("Total Employees: " + Employee.getCount());
    }//main ends here
}//employeemain ends here
