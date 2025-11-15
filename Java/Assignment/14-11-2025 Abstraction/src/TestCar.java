class Car extends Object {
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
    
    public String toString() {
    	return "\nModel : "+this.model+"\nPrice : "+this.price+"\nFule Capacity : "+this.fuelCapacity+"\nBrand : "+this.brand+"\nColor : "+this.color;
    }
    
} // Car class ends here


class TestCar {
    public static void main(String[] args) {
    	Object c = new Car();
    	
    	System.out.println(c);
    	System.out.println(c.toString());
    } // main ends here
} // TestCar ends here
