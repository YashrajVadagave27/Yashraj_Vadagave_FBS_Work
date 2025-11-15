abstract class Farmer {
    int farmerID;
    String farmerName;
    double landArea;
    String city;
    double annualIncome;
    int noOfEquipment;
    double insuranceAmount;

    // Default Constructor
    Farmer() {
        System.out.println("Default Constructor of Farmer Called");
        this.farmerID = 0;
        this.farmerName = "Unknown";
        this.landArea = 0.0;
        this.city = "Not specified";
        this.annualIncome = 0.0;
        this.noOfEquipment = 0;
        this.insuranceAmount = 0.0;
    }

    // Parameterized Constructor
    Farmer(int id, String name, double area, String c, double income, int equip, double insurance) {
        System.out.println("Parameterized Constructor of Farmer Called");
        this.farmerID = id;
        this.farmerName = name;
        this.landArea = area;
        this.city = c;
        this.annualIncome = income;
        this.noOfEquipment = equip;
        this.insuranceAmount = insurance;
    }

    // Setters and Getters
    void setFarmerID(int id) { 
    	this.farmerID = id; 
    }
    int getFarmerID() { 
    	return this.farmerID; 
    }

    void setFarmerName(String name) { 
    	this.farmerName = name; 
    }
    String getFarmerName() { 
    	return this.farmerName; 
    }

    void setLandArea(double area) { 
    	this.landArea = area; 
    }
    double getLandArea() { 
    	return this.landArea; 
    }

    void setCity(String c) { 
    	this.city = c; 
    }
    String getCity() { 
    	return this.city; 
    }

    void setAnnualIncome(double income) { 
    	this.annualIncome = income; 
    }
    double getAnnualIncome() { 
    	return this.annualIncome; 
    }

    void setNoOfEquipment(int equip) { 
    	this.noOfEquipment = equip; 
    }
    int getNoOfEquipment() { 
    	return this.noOfEquipment; 
    }

    void setInsuranceAmount(double insurance) { 
    	this.insuranceAmount = insurance; 
    }
    double getInsuranceAmount() { 
    	return this.insuranceAmount; 
    }

    abstract void calSubsidy();
    
    void display() {
        System.out.println("Farmer ID: " + this.farmerID);
        System.out.println("Farmer Name: " + this.farmerName);
        System.out.println("Land Area: " + this.landArea);
        System.out.println("City: " + this.city);
        System.out.println("Annual Income: " + this.annualIncome);
        System.out.println("No. of Equipment: " + this.noOfEquipment);
        System.out.println("Insurance Amount: " + this.insuranceAmount);
    }
}//farmer ends here

class DairyFarmer extends Farmer {
    int noOfCattle;
    double milkProducedPerDay;
    String dairyLicenseNo;

    // Default Constructor
    DairyFarmer() {
        super();
        System.out.println("Default Constructor of DairyFarmer Called");
        this.noOfCattle = 0;
        this.milkProducedPerDay = 0.0;
        this.dairyLicenseNo = "Not Available";
    }

    // Parameterized Constructor
    DairyFarmer(int id, String name, double area, String c, double income, int equip, double insurance,
                int cattle, double milk, String license) {
        super(id, name, area, c, income, equip, insurance);
        System.out.println("Parameterized Constructor of DairyFarmer Called");
        this.noOfCattle = cattle;
        this.milkProducedPerDay = milk;
        this.dairyLicenseNo = license;
    }

    void setNoOfCattle(int cattle) { 
    	this.noOfCattle = cattle; 
    }
    int getNoOfCattle() { 
    	return this.noOfCattle; 
    }

    void setMilkProducedPerDay(double milk) { 
    	this.milkProducedPerDay = milk; 
    }
    double getMilkProducedPerDay() { 
    	return this.milkProducedPerDay; 
    }

    void setDairyLicenseNo(String license) { 
    	this.dairyLicenseNo = license; 
    }
    String getDairyLicenseNo() { 
    	return this.dairyLicenseNo; 
    }

    void calSubsidy() {
        System.out.println("Subsidy is given based on the number of cattle and total milk produced per day.");
    }

    void display() {
        System.out.println("\nDairy Farmer Details");
        super.display();
        System.out.println("No. of Cattle: " + this.noOfCattle);
        System.out.println("Milk Produced Per Day: " + this.milkProducedPerDay);
        System.out.println("Dairy License No: " + this.dairyLicenseNo);
    }
}//dairyfarmer ends here

class PoultryFarmer extends Farmer {
    int noOfChickens;
    int noOfSheds;
    int eggsProducedPerDay;
    int shedCapacity;
    String poultryFarmName;

    PoultryFarmer() {
        super();
        System.out.println("Default Constructor of PoultryFarmer Called");
        this.noOfChickens = 0;
        this.noOfSheds = 0;
        this.eggsProducedPerDay = 0;
        this.shedCapacity = 0;
        this.poultryFarmName = "Not Named";
    }

    PoultryFarmer(int id, String name, double area, String c, double income, int equip, double insurance,
                  int chickens, int sheds, int eggs, int capacity, String farmName) {
        super(id, name, area, c, income, equip, insurance);
        System.out.println("Parameterized Constructor of PoultryFarmer Called");
        this.noOfChickens = chickens;
        this.noOfSheds = sheds;
        this.eggsProducedPerDay = eggs;
        this.shedCapacity = capacity;
        this.poultryFarmName = farmName;
    }

    int getNoOfChickens() {
		return noOfChickens;
	}

	void setNoOfChickens(int noOfChickens) {
		this.noOfChickens = noOfChickens;
	}

	int getNoOfSheds() {
		return noOfSheds;
	}

	void setNoOfSheds(int noOfSheds) {
		this.noOfSheds = noOfSheds;
	}

	int getEggsProducedPerDay() {
		return eggsProducedPerDay;
	}

	void setEggsProducedPerDay(int eggsProducedPerDay) {
		this.eggsProducedPerDay = eggsProducedPerDay;
	}

	int getShedCapacity() {
		return shedCapacity;
	}

	void setShedCapacity(int shedCapacity) {
		this.shedCapacity = shedCapacity;
	}

	String getPoultryFarmName() {
		return poultryFarmName;
	}

	void setPoultryFarmName(String poultryFarmName) {
		this.poultryFarmName = poultryFarmName;
	}

	void calSubsidy() {
        System.out.println("Subsidy is given based on the number of chickens and egg production rate.");
    }

	void display() {
        System.out.println("\nPoultry Farmer Details");
        super.display();
        System.out.println("No. of Chickens: " + this.noOfChickens);
        System.out.println("No. of Sheds: " + this.noOfSheds);
        System.out.println("Eggs Produced Per Day: " + this.eggsProducedPerDay);
        System.out.println("Shed Capacity: " + this.shedCapacity);
        System.out.println("Poultry Farm Name: " + this.poultryFarmName);
    }
}//poultryfarmer ends here

class OrganicFarmer extends Farmer {
    String organicCertID;
    String cropType;
    String fertilizerUsed;

    OrganicFarmer() {
        super();
        System.out.println("Default Constructor of OrganicFarmer Called");
        this.organicCertID = "Not Available";
        this.cropType = "Not Specified";
        this.fertilizerUsed = "Not Specified";
    }

    OrganicFarmer(int id, String name, double area, String c, double income, int equip, double insurance,
                  String cert, String crop, String fertilizer) {
        super(id, name, area, c, income, equip, insurance);
        System.out.println("Parameterized Constructor of OrganicFarmer Called");
        this.organicCertID = cert;
        this.cropType = crop;
        this.fertilizerUsed = fertilizer;
    }

    String getOrganicCertID() {
		return organicCertID;
	}

	void setOrganicCertID(String organicCertID) {
		this.organicCertID = organicCertID;
	}

	String getCropType() {
		return cropType;
	}

	void setCropType(String cropType) {
		this.cropType = cropType;
	}

	String getFertilizerUsed() {
		return fertilizerUsed;
	}

	void setFertilizerUsed(String fertilizerUsed) {
		this.fertilizerUsed = fertilizerUsed;
	}

	void calSubsidy() {
        System.out.println("Subsidy is given based on organic certification and eco-friendly farming methods.");
    }

	void display() {
        System.out.println("\nOrganic Farmer Details");
        super.display();
        System.out.println("Organic Certificate ID: " + this.organicCertID);
        System.out.println("Crop Type: " + this.cropType);
        System.out.println("Fertilizer Used: " + this.fertilizerUsed);
    }
}//organicfarmer ends here

class FarmMain {
    public static void main(String[] args) {

        Farmer df;

        df = new DairyFarmer(101, "Ramesh", 10.5, "Pune", 850000, 5, 200000, 15, 120.5, "DL12345");
        df.display();
        df.calSubsidy();

        df = new PoultryFarmer(102, "Suresh", 8.0, "Nashik", 600000, 3, 150000, 500, 4, 400, 600, "Happy Hen Farm");
        df.display();
        df.calSubsidy();

        df = new OrganicFarmer(103, "Mahesh", 12.0, "Satara", 950000, 6, 250000, "ORG5678", "Wheat", "Cow Dung Compost");
        df.display();
        df.calSubsidy();
    }//main ends here
}//farmmain ends here
