class Admin extends Object{
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

    public String toString() {
    	return "\nID : "+this.id+"\nName : "+this.name+"\nSalary : "+this.salary+"\nAllowance : "+this.allowance;
    }
} // Admin class ends here


class TestAdmin {
    public static void main(String[] args) {
    	Object a = new Admin();
    	
    	System.out.println(a);
    	System.out.println(a.toString());
    } // main ends here
} // TestAdmin ends here
