import java.util.Scanner;

class Car {
    int model, price, fuelCapacity;
    String brand, color;

    // Default Constructor
    Car() {
        System.out.println("Constructor called");
        this.model = 2016;
        this.price = 150000;
        this.fuelCapacity = 50;
        this.brand = "Nano";
        this.color = "Red";
    }

    // Parameterized Constructor
    Car(int m, int p, int f, String b, String c) {
        System.out.println("Parameterized constructor called");
        this.model = m;
        this.price = p;
        this.fuelCapacity = f;
        this.brand = b;
        this.color = c;
    }

    // Setter Methods
    void setModel(int m) {
        this.model = m;
    }

    void setPrice(int p) {
        this.price = p;
    }

    void setFuelCapacity(int f) {
        this.fuelCapacity = f;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setColor(String c) {
        this.color = c;
    }

    // Getter Methods
    int getModel() {
        return this.model;
    }

    int getPrice() {
        return this.price;
    }

    int getFuelCapacity() {
        return this.fuelCapacity;
    }

    String getBrand() {
        return this.brand;
    }

    String getColor() {
        return this.color;
    }

    // Display Method
    void display() {
        System.out.println("\nCar Details:");
        System.out.println("Model         : " + getModel());
        System.out.println("Price         : " + getPrice());
        System.out.println("Fuel Capacity : " + getFuelCapacity());
        System.out.println("Brand         : " + getBrand());
        System.out.println("Color         : " + getColor());
    }
} // Car class ends here


class TestCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor call
        Car c1 = new Car();
        c1.display();

        System.out.println("\nEnter details for second car:");
        System.out.print("Enter Model Year: ");
        int model = sc.nextInt();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        System.out.print("Enter Fuel Capacity: ");
        int fuelCapacity = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Color: ");
        String color = sc.nextLine();

        Car c2 = new Car(model, price, fuelCapacity, brand, color);
        c2.display();

       
    } // main ends here
} // TestCar ends here
