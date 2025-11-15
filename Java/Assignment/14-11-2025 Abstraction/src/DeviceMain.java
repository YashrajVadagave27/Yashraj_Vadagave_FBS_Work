abstract class Device {
    String brand;
    double price;
    static int deviceCount = 0;

    Device() {
        System.out.println("Device Default Constructor Called");
        this.brand = "Unknown";
        this.price = 0.0;
        deviceCount++;
    }

    Device(String brand, double price) {
        System.out.println("Device Parameterized Constructor Called");
        this.brand = brand;
        this.price = price;
        deviceCount++;
    }

    String getBrand() { 
    	return brand; 
    }
    void setBrand(String brand) { 
    	this.brand = brand; 
    }

    double getPrice() { 
    	return price; 
    }
    void setPrice(double price) { 
    	this.price = price; 
    }

    static int getDeviceCount() { 
    	return deviceCount; 
    }

    abstract void feature();

    void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }
}//device ends here

class Mobile extends Device {
    String os;

    Mobile() {
        super();
        System.out.println("Mobile Default Constructor Called");
        this.os = "Android";
    }

    Mobile(String brand, double price, String os) {
        super(brand, price);
        System.out.println("Mobile Parameterized Constructor Called");
        this.os = os;
    }
    
    String getOs() {
		return os;
	}

	void setOs(String os) {
		this.os = os;
	}

	void feature() {
        System.out.println("Mobile OS: " + this.os + " with touch display");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("OS: " + this.os);
        
    }
}//mobile ends here

class Laptop extends Device {
    int ram;

    Laptop() {
        super();
        System.out.println("Laptop Default Constructor Called");
        this.ram = 8;
    }

    Laptop(String brand, double price, int ram) {
        super(brand, price);
        System.out.println("Laptop Parameterized Constructor Called");
        this.ram = ram;
    }
    
    int getRam() {
		return ram;
	}

	void setRam(int ram) {
		this.ram = ram;
	}

	void feature() {
        System.out.println("Laptop has " + this.ram + "GB RAM for multitasking");
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("RAM: " + this.ram + "GB");
        
    }
}//laptop ends here

class SmartWatch extends Device {
    boolean heartRateSensor;

    SmartWatch() {
        super();
        System.out.println("SmartWatch Default Constructor Called");
        this.heartRateSensor = true;
    }

    SmartWatch(String brand, double price, boolean heartRateSensor) {
        super(brand, price);
        System.out.println("SmartWatch Parameterized Constructor Called");
        this.heartRateSensor = heartRateSensor;
    }
    
    boolean isHeartRateSensor() {
		return heartRateSensor;
	}

	void setHeartRateSensor(boolean heartRateSensor) {
		this.heartRateSensor = heartRateSensor;
	}

	void feature() {
        System.out.println("SmartWatch Feature: Heart Rate Sensor = " + this.heartRateSensor);
        System.out.println();
    }

    void display() {
        super.display();
        System.out.println("Heart Rate Sensor: " + this.heartRateSensor);
        
    }
}//smartwatch ends here

class DeviceMain {
    public static void main(String[] args) {
        Device[] d = new Device[3];

        d[0] = new Mobile("Samsung", 20000, "Android");
        d[1] = new Laptop("HP", 55000, 16);
        d[2] = new SmartWatch("Noise", 5000, true);

        for (int i=0; i<d.length; i++) {
            d[i].display();
            d[i].feature();
        }

        System.out.println("\nTotal Devices: " + Device.getDeviceCount());
    }//main ends here
}//devicemain ends here
