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
        System.out.println("Car Details:");
        System.out.println("Model         : " + getModel());
        System.out.println("Price         : " + getPrice());
        System.out.println("Fuel Capacity : " + getFuelCapacity());
        System.out.println("Brand         : " + getBrand());
        System.out.println("Color         : " + getColor());
        
    }
} // Car class ends here


class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car(); // Calls default constructor
        c1.display();

        Car c2 = new Car(2022, 800000, 45, "Hyundai i20", "Blue"); // Calls parameterized constructor
        c2.display();
    } // main ends here
} // TestCar ends here
