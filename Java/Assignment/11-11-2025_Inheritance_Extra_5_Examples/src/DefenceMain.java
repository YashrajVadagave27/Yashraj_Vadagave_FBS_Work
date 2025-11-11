class Defence {
    String nameOfHead;
    int noOfTroops;
    int noOfVehicles;
    double budget;
    String locationOfHeadquarter;
    String countryName;
    int manpowerCount;
    int noOfBases;
    int noOfMissionPerformed;

    // Constructor
    Defence(String head, int troops, int vehicles, double budget, String location, String country, int manpower, int bases, int mission) {
        this.nameOfHead = head;
        this.noOfTroops = troops;
        this.noOfVehicles = vehicles;
        this.budget = budget;
        this.locationOfHeadquarter = location;
        this.countryName = country;
        this.manpowerCount = manpower;
        this.noOfBases = bases;
        this.noOfMissionPerformed = mission;
    }

    String getNameOfHead() {
		return nameOfHead;
	}

	void setNameOfHead(String nameOfHead) {
		this.nameOfHead = nameOfHead;
	}

	int getNoOfTroops() {
		return noOfTroops;
	}

	void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}

	int getNoOfVehicles() {
		return noOfVehicles;
	}

	void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}

	double getBudget() {
		return budget;
	}

	void setBudget(double budget) {
		this.budget = budget;
	}

	String getLocationOfHeadquarter() {
		return locationOfHeadquarter;
	}

	void setLocationOfHeadquarter(String locationOfHeadquarter) {
		this.locationOfHeadquarter = locationOfHeadquarter;
	}

	String getCountryName() {
		return countryName;
	}

	void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	int getManpowerCount() {
		return manpowerCount;
	}

	void setManpowerCount(int manpowerCount) {
		this.manpowerCount = manpowerCount;
	}

	int getNoOfBases() {
		return noOfBases;
	}

	void setNoOfBases(int noOfBases) {
		this.noOfBases = noOfBases;
	}

	int getNoOfMissionPerformed() {
		return noOfMissionPerformed;
	}

	void setNoOfMissionPerformed(int noOfMissionPerformed) {
		this.noOfMissionPerformed = noOfMissionPerformed;
	}

	void display() {
        System.out.println("===== Defence Details =====");
        System.out.println("Head: " + this.nameOfHead);
        System.out.println("Troops: " + this.noOfTroops);
        System.out.println("Vehicles: " + this.noOfVehicles);
        System.out.println("Budget: " + this.budget);
        System.out.println("Headquarter: " + this.locationOfHeadquarter);
        System.out.println("Country: " + this.countryName);
        System.out.println("Manpower: " + this.manpowerCount);
        System.out.println("Bases: " + this.noOfBases);
        System.out.println("Missions: " + this.noOfMissionPerformed);
    }
}// defence ends here

class Army extends Defence {
    int noOfTanks;
    int noOfGuns;
    int noOfBattalions;
    int noOfGrenades;

    Army(String head, int troops, int vehicles, double budget, String location, String country, int manpower,
         int tanks, int guns, int battalions, int bases, int mission, int grenades) {
        super(head, troops, vehicles, budget, location, country, manpower, bases, mission);
        this.noOfTanks = tanks;
        this.noOfGuns = guns;
        this.noOfBattalions = battalions;
        this.noOfGrenades = grenades;
    }

    int getNoOfTanks() {
		return noOfTanks;
	}

	void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}

	int getNoOfGuns() {
		return noOfGuns;
	}

	void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

	int getNoOfBattalions() {
		return noOfBattalions;
	}

	void setNoOfBattalions(int noOfBattalions) {
		this.noOfBattalions = noOfBattalions;
	}

	int getNoOfGrenades() {
		return noOfGrenades;
	}

	void setNoOfGrenades(int noOfGrenades) {
		this.noOfGrenades = noOfGrenades;
	}

	void showArmy() {
        super.display();
        System.out.println("Tanks: " + this.noOfTanks);
        System.out.println("Guns: " + this.noOfGuns);
        System.out.println("Battalions: " + this.noOfBattalions);
        System.out.println("Grenades: " + this.noOfGrenades);
    }
}//army ends here

class Navy extends Defence {
    int noOfShips;
    int noOfSubmarines;
    int noOfTorpedos;

    Navy(String head, int troops, int vehicles, double budget, String location, String country, int manpower,
         int ships, int submarines, int torpedos, int bases, int mission) {
        super(head, troops, vehicles, budget, location, country, manpower, bases, mission);
        this.noOfShips = ships;
        this.noOfSubmarines = submarines;
        this.noOfTorpedos = torpedos;
    }

    void showNavy() {
        super.display();
        System.out.println("Ships: " + noOfShips);
        System.out.println("Submarines: " + noOfSubmarines);
        System.out.println("Torpedos: " + noOfTorpedos);
    }
}//navy ends here

class AirForce extends Defence {
    int noOfMissiles;
    int noOfAircrafts;
    int noOfSquadrons;

    AirForce(String head, int troops, int vehicles, double budget, String location, String country, int manpower,
             int missiles, int aircrafts, int squadrons, int bases, int mission) {
        super(head, troops, vehicles, budget, location, country, manpower, bases, mission);
        this.noOfMissiles = missiles;
        this.noOfAircrafts = aircrafts;
        this.noOfSquadrons = squadrons;
    }

    int getNoOfMissiles() {
		return noOfMissiles;
	}

	void setNoOfMissiles(int noOfMissiles) {
		this.noOfMissiles = noOfMissiles;
	}

	int getNoOfAircrafts() {
		return noOfAircrafts;
	}

	void setNoOfAircrafts(int noOfAircrafts) {
		this.noOfAircrafts = noOfAircrafts;
	}

	int getNoOfSquadrons() {
		return noOfSquadrons;
	}

	void setNoOfSquadrons(int noOfSquadrons) {
		this.noOfSquadrons = noOfSquadrons;
	}

	void showAirForce() {
        super.display();
        System.out.println("Missiles: " + this.noOfMissiles);
        System.out.println("Aircrafts: " + this.noOfAircrafts);
        System.out.println("Squadrons: " + this.noOfSquadrons);
    }
}//airforce ends here

public class DefenceMain {
    public static void main(String[] args) {
        Army a = new Army("Yashraj", 50000, 2000, 9000.50, "Delhi", "India", 70000, 300, 1000, 10, 150, 100, 1000);
        a.showArmy();

        System.out.println("\n\n");

        Navy n = new Navy("Yash", 20000, 500, 7000.75, "Mumbai", "India", 30000, 50, 10, 100, 250, 200);
        n.showNavy();

        System.out.println("\n\n");

        AirForce af = new AirForce("Raj", 15000, 300, 8500.25, "Bangalore", "India", 25000, 200, 150, 20, 350, 300);
        af.showAirForce();
    }//main ends here
}//Defence main ends here

