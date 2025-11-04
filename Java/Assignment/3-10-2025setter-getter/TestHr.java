class HR {
    int id;
    String name;
    double salary;
    double commission;

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

        HR h1 = new HR();
        h1.setId(101);
        h1.setName("Sandip");
        h1.setSalary(20000.0);
        h1.setCommission(12.3);
        h1.display();

    } // main ends here
} // TestHr ends here
