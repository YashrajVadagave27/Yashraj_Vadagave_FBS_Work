class Car {
    int model, price, fuelCapacity;
    String brand, color;

    // Setter Methods
    void setModel(int m) {
        this.model = m;
    }

    void setPrice(int p) {
        this.price = p;
    }

    void setFuelCapacity(int c) {
        this.fuelCapacity = c;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    void setColor(String s) {
        this.color = s;
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
} // Car ends here

class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setModel(2016);
        c1.setPrice(150000);
        c1.setFuelCapacity(50);
        c1.setBrand("Nano");
        c1.setColor("Red");

        c1.display();
    } // main ends here
} // TestCar ends here
