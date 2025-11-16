import java.util.*;

abstract class ElectricityBill {
    int units;
    String customerName;

    ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }
    
    int getUnits() {
		return this.units;
	}

	void setUnits(int units) {
		this.units = units;
	}

	String getCustomerName() {
		return this.customerName;
	}

	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	void showUsage() {
        System.out.println("Customer: " + this.customerName);
        System.out.println("Units Consumed: " + this.units);
    }

    abstract double calculateBill();

    final void generateBill() {
        double bill = calculateBill();
        double tax = bill * 0.05;
        double finalAmount = bill + tax + 50;

        System.out.println("Base Bill: Rs." + bill);
        System.out.println("Tax (5%): Rs." + tax);
        System.out.println("Fixed Charge: Rs.50");
        System.out.println("Final Bill Amount: Rs." + finalAmount);
        System.out.println("----------------------------\n");
    }
}//electricitybill ends here

class ResidentialBill extends ElectricityBill {

    ResidentialBill(String name, int units) {
        super(name, units);
    }

    double calculateBill() {
        double amount = 0;

        if (units <= 100) {
            amount = units * 2.5;
        } else if (units <= 300) {
            amount = (100 * 2.5) + ((units - 100) * 3.5);
        } else {
            amount = (100 * 2.5) + (200 * 3.5) + ((units - 300) * 5);
        }

        if (units > 500) {
            amount += 150;
        }

        return amount;
    }
}//recidentialbill ends here

class CommercialBill extends ElectricityBill {

    CommercialBill(String name, int units) {
        super(name, units);
    }

    double calculateBill() {
        double amount = units * 6.5;

        if (units < 200) {
            amount = 1500;
        }

        if (units > 1000) {
            amount += amount * 0.08; 
        }

        return amount;
    }
}//commercialbill ends here

public class ElectricityMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Select Customer Type:\n1. Residential\n2. Commercial");
        int ch = s.nextInt();
        s.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = s.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = s.nextInt();

        ElectricityBill bill;

        if (ch == 1)
            bill = new ResidentialBill(name, units);
        else
            bill = new CommercialBill(name, units);

        bill.showUsage();
        bill.generateBill();

    }
}

