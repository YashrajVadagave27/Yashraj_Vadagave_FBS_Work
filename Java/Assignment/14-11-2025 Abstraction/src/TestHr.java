class HR extends Object {
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
    
    public String toString() {
    	return "\nID : "+this.id+"\nName : "+this.name+"\nSalary : "+this.salary+"\nCommission : "+this.commission;
    }
} // HR class ends here


class TestHr {
    public static void main(String[] args) {
    	Object c = new Complex();
    	
    	System.out.println(c);
    	System.out.println(c.toString());
  
    } // main ends here
} // TestHr ends here
