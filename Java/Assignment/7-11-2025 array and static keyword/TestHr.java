class HR {
    int id;
    String name;
    double salary;
    double commission;

    // Default Constructor
    HR() {
        System.out.println("Constructor called");
        this.id = 101;
        this.name = "Sandip";
        this.salary = 20000.0;
        this.commission = 12.3;
    }

    // Parameterized Constructor
    HR(int i, String n, double s, double c) {
        System.out.println("Parameterized constructor called");
        this.id = i;
        this.name = n;
        this.salary = s;
        this.commission = c;
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

    void setCommission(double c) {
        this.commission = c;
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

    double getCommission() {
        return this.commission;
    }

    // Display Method
    void display() {
        System.out.println("HR Details:");
        System.out.println("ID          : " + getId());
        System.out.println("Name        : " + getName());
        System.out.println("Salary      : " + getSalary());
        System.out.println("Commission  : " + getCommission());
    }
} // HR class ends here


class TestHr {
    public static void main(String[] args) {
	HR[] h = new HR[3];
        h[0] = new HR();  
      	h[1] = new HR(102, "Rohini", 25000.0, 15.5);
	h[2] = new HR();
       	for(int i=0;i<h.length;i++)
	{
		h[i].display();
	}
     
    } // main ends here
} // TestHr ends here
