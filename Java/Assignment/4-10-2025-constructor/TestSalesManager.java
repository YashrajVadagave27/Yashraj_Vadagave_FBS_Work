class SalesManager {
    int id;
    String name;
    double salary, incentive;
    int target;

    // Default Constructor
    SalesManager() {
        System.out.println("Constructor called");
        this.id = 101;
        this.name = "Rahul Sharma";
        this.salary = 50000.0;
        this.incentive = 7000.0;
        this.target = 20;
    }

    // Parameterized Constructor
    SalesManager(int i, String n, double s, double inc, int t) {
        System.out.println("Parameterized constructor called");
        this.id = i;
        this.name = n;
        this.salary = s;
        this.incentive = inc;
        this.target = t;
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

    void setIncentive(double inc) {
        this.incentive = inc;
    }

    void setTarget(int t) {
        this.target = t;
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

    double getIncentive() {
        return this.incentive;
    }

    int getTarget() {
        return this.target;
    }

    // Display Method
    void display() {
        System.out.println("Sales Manager Details:");
        System.out.println("ID        : " + getId());
        System.out.println("Name      : " + getName());
        System.out.println("Salary    : " + getSalary());
        System.out.println("Incentive : " + getIncentive());
        System.out.println("Target    : " + getTarget());
        
    }
} // SalesManager class ends here


class TestSalesManager {
    public static void main(String[] args) {
        SalesManager sm1 = new SalesManager(); // Calls default constructor
        sm1.display();

        SalesManager sm2 = new SalesManager(102, "Rohit Verma", 60000.0, 8000.0, 25); // Calls parameterized constructor
        sm2.display();
    } // main ends here
} // TestSalesManager ends here
