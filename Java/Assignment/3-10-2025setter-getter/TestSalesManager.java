class SalesManager {
    int id;
    String name;
    double salary, incentive;
    int target;

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

        SalesManager sm1 = new SalesManager();
        sm1.setId(101);
        sm1.setName("Rahul Sharma");
        sm1.setSalary(50000.0);
        sm1.setIncentive(7000.0);
        sm1.setTarget(20);
        sm1.display();

    } // main ends here
} // TestSalesManager ends here
