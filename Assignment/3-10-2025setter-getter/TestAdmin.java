class Admin {
    int id;
    String name;
    double salary;
    double allowance;

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
    }
} // Admin class ends here


class TestAdmin {
    public static void main(String[] args) {
        Admin a1 = new Admin();
        a1.setId(101);
        a1.setName("Suresh");
        a1.setSalary(35000.0);
        a1.setAllowance(5000.0);
        a1.display();
    }
} // TestAdmin ends here
