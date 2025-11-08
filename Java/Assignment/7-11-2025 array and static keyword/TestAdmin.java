class Admin {
    int id;
    String name;
    double salary;
    double allowance;

    // Default Constructor
    Admin() {
        System.out.println("Constructor called");
        this.id = 101;
        this.name = "Rohit";
        this.salary = 35000.0;
        this.allowance = 5000.0;
    }

    // Parameterized Constructor
    Admin(int i, String n, double s, double a) {
        System.out.println("Parameterized constructor called");
        this.id = i;
        this.name = n;
        this.salary = s;
        this.allowance = a;
    }

    // Setter Methods
    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setAllowance(double a) {
        this.allowance = a;
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

    double getAllowance() {
        return this.allowance;
    }

    // Display Method
    void display() {
        System.out.println("Admin ID: " + getId());
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin Salary: " + getSalary());
        System.out.println("Admin Allowance: " + getAllowance());
        System.out.println("-----------------------------------");
    }
} // Admin class ends here


class TestAdmin {
    public static void main(String[] args) {
	Admin[] ad = new Admin[3];
        ad[0] = new Admin();  
      	ad[1] = new Admin(102, "Ramesh", 40000.0, 6000.0);
	ad[2] = new Admin();
       	for(int i=0;i<ad.length;i++)
	{
		ad[i].display();
	}
    } // main ends here
} // TestAdmin ends here
