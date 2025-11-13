class HospitalStaff {
    String name;
    String department;
    double salary;
    static int staffCount = 0;

    HospitalStaff() {
        System.out.println("HospitalStaff Default Constructor Called");
        this.name = "Unknown";
        this.department = "General";
        this.salary = 0.0;
        staffCount++;
    }

    HospitalStaff(String name, String department, double salary) {
        System.out.println("HospitalStaff Parameterized Constructor Called");
        this.name = name;
        this.department = department;
        this.salary = salary;
        staffCount++;
    }

    String getName() { 
    	return name; 
    }
    void setName(String name) { 
    	this.name = name; 
    }

    String getDepartment() {
    	return department; 
    }
    void setDepartment(String department) { 
    	this.department = department; 
    }

    double getSalary() { 
    	return salary; 
    }
    void setSalary(double salary) { 
    	this.salary = salary; 
    }

    static int getStaffCount() { 
    	return staffCount; 
    }

    void duty() {
        System.out.println("Hospital staff performing general duties...");
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: ₹" + this.salary);
    }
}//HospitalStaff ends here

class Doctor extends HospitalStaff {
    String specialization;

    Doctor() {
        super();
        System.out.println("Doctor Default Constructor Called");
        this.specialization = "General Physician";
    }

    Doctor(String name, String department, double salary, String specialization) {
        super(name, department, salary);
        System.out.println("Doctor Parameterized Constructor Called");
        this.specialization = specialization;
    }
    
    String getSpecialization() {
		return specialization;
	}

	void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	void duty() {
        System.out.println(this.name + " is treating patients as a " + this.specialization + ".");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + this.specialization);
    }
}//Doctor ends here 

class Nurse extends HospitalStaff {
    String shift;

    Nurse() {
        super();
        System.out.println("Nurse Default Constructor Called");
        this.shift = "Day";
    }

    Nurse(String name, String department, double salary, String shift) {
        super(name, department, salary);
        System.out.println("Nurse Parameterized Constructor Called");
        this.shift = shift;
    }
    
    String getShift() {
		return shift;
	}

	void setShift(String shift) {
		this.shift = shift;
	}

	void duty() {
        System.out.println(this.name + " is assisting doctors in the " + this.shift + " shift.");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Shift: " + this.shift);
    }
}//Nurse ends here

class Receptionist extends HospitalStaff {
    String deskArea;

    Receptionist() {
        super();
        System.out.println("Receptionist Default Constructor Called");
        this.deskArea = "Main Lobby";
    }

    Receptionist(String name, String department, double salary, String deskArea) {
        super(name, department, salary);
        System.out.println("Receptionist Parameterized Constructor Called");
        this.deskArea = deskArea;
    }
    
    String getDeskArea() {
		return deskArea;
	}

	void setDeskArea(String deskArea) {
		this.deskArea = deskArea;
	}

	void duty() {
        System.out.println(this.name + " is handling patient queries at " + this.deskArea + ".");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Desk Area: " + this.deskArea);
    }
}//Receptionist ends here

class HospitalMain {
    public static void main(String[] args) {
        HospitalStaff[] h = new HospitalStaff[3];

        h[0] = new Doctor("Dr. Sneha", "Cardiology", 90000, "Cardiologist");
        h[1] = new Nurse("Priya", "Emergency", 50000, "Night");
        h[2] = new Receptionist("Amit", "Front Office", 30000, "Reception Desk");

        for (int i=0; i<h.length; i++) {
            h[i].display();
            h[i].duty();
        }

        System.out.println("\nTotal Hospital Staff: " + HospitalStaff.getStaffCount());
    }//main ends here
}//hospitalmain ends here
