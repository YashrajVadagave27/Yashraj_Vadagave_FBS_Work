abstract class Vehicle {
    String brand;
    String model;
    double price;
    static int vCount = 0;

    Vehicle() {
        System.out.println("Vehicle Default Constructor Called");
        this.brand = "Tata";
        this.model = "Nexon";
        this.price = 1000000;
        vCount++;
    }

    Vehicle(String brand, String model, double price) {
        System.out.println("Vehicle Parameterized Constructor Called");
        this.brand = brand;
        this.model = model;
        this.price = price;
        vCount++;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    static int getvCount() {
        return vCount;
    }

    abstract void brake();

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }
}//vehicle ends here


class Carr extends Vehicle {
    int seats;
    String fuelType;

    Carr() {
        super();
        System.out.println("Car Default Constructor Called");
        this.seats = 5;
        this.fuelType = "Petrol";
    }

    Carr(String brand, String model, double price, int seats, String fuelType) {
        super(brand, model, price);
        System.out.println("Car Parameterized Constructor Called");
        this.seats = seats;
        this.fuelType = fuelType;
    }

    int getSeats() {
        return seats;
    }

    void setSeats(int seats) {
        this.seats = seats;
    }

    String getFuelType() {
        return fuelType;
    }

    void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    void brake() {
        System.out.println("Car uses Drum Brakes");
    }

    void display() {
        super.display();
        System.out.println("Seats: " + this.seats);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println();
    }
}//car ends here


class Bike extends Vehicle {
    String type;
    int engineCC;

    Bike() {
        super();
        System.out.println("Bike Default Constructor Called");
        this.type = "Sports";
        this.engineCC = 200;
    }

    Bike(String brand, String model, double price, String type, int cc) {
        super(brand, model, price);
        System.out.println("Bike Parameterized Constructor Called");
        this.type = type;
        this.engineCC = cc;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    int getEngineCC() {
        return engineCC;
    }

    void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    void brake() {
        System.out.println("Bike uses Disc Brakes");
    }

    void display() {
        super.display();
        System.out.println("Type: " + this.type);
        System.out.println("Engine CC: " + this.engineCC);
        brake();
        System.out.println();
    }
}//bike ends here


class Bus extends Vehicle {
    int capacity;
    String route;

    Bus() {
        super();
        System.out.println("Bus Default Constructor Called");
        this.capacity = 40;
        this.route = "City";
    }

    Bus(String brand, String model, double price, int cap, String route) {
        super(brand, model, price);
        System.out.println("Bus Parameterized Constructor Called");
        this.capacity = cap;
        this.route = route;
    }

    int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    String getRoute() {
        return route;
    }

    void setRoute(String route) {
        this.route = route;
    }

    void brake() {
        System.out.println("Bus uses Air Brakes");
    }

    void display() {
        super.display();
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Route: " + this.route);
        System.out.println();
    }
}//bus ends here


class VehicleMain {
    public static void main(String[] args) {
        Vehicle c;
        
        c = new Carr();
        c.display();
        c.brake();

        c = new Bike("Yamaha", "R15", 180000, "Racing", 155);
        c.display();
        c.brake();

        c = new Bus("Volvo", "9400", 9000000, 50, "Intercity");
        c.display();
        c.brake();

        System.out.println("Total Vehicle Count: " + Vehicle.getvCount());
    }//main ends here
}//VehicleMain ends here
