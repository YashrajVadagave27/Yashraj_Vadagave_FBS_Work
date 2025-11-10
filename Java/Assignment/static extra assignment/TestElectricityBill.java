import java.util.Scanner;

class ElectricityBill {
    String customerName;
    int unitsConsumed;
    static double ratePerUnit;

    // Static block
    static {
        ratePerUnit = 6.5;
    }

    // Default constructor
    ElectricityBill() {
        this.customerName = "Yashraj";
        this.unitsConsumed = 100;
    }

    // Parameterized constructor
    ElectricityBill(String name, int units) {
        this.customerName = name;
        this.unitsConsumed = units;
    }

    // Setters
    void setCustomerName(String name) {
        this.customerName = name;
    }

    void setUnitsConsumed(int units) {
        this.unitsConsumed = units;
    }

    static void setRatePerUnit(double rate) {
        ratePerUnit = rate;
    }

    // Getters
    String getCustomerName() {
        return this.customerName;
    }

    int getUnitsConsumed() {
        return this.unitsConsumed;
    }

    double getRatePerUnit() {
        return ratePerUnit;
    }

    double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    void display() {
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Units Consumed: " + getUnitsConsumed());
        System.out.println("Rate per Unit: " + getRatePerUnit());
        System.out.println("Total Bill: " + calculateBill());
    }
}//ElectricityBill ends here

class TestElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Parameterized input
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        System.out.println("\nDefault Constructor Output:");
        ElectricityBill e1 = new ElectricityBill();
        e1.display();

        System.out.println("\nParameterized Constructor Output:");
        ElectricityBill e2 = new ElectricityBill(name, units);
        e2.display();

        System.out.print("\nEnter Customer Name (Setter): ");
        String sname = sc.next();
        System.out.print("Enter Units Consumed (Setter): ");
        int sunits = sc.nextInt();

        System.out.println("\nSetter-Getter Output:");
        ElectricityBill e3 = new ElectricityBill();
        e3.setCustomerName(sname);
        e3.setUnitsConsumed(sunits);
        e3.display();

        ElectricityBill.setRatePerUnit(8.2);
        System.out.println("\nAfter static function called (Rate Changed):");
        e3.display();
        e1.display();
        e2.display();
    }//main ends here
}//TestElectricityBill ends here
