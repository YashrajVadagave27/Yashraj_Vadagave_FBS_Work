interface Racer{
	void toRace();
}
//interface racer ends here

class SportCar implements Racer{
	String brand;
	int speed;
	
	SportCar(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}

	public void toRace() {
		System.out.println(this.brand + " is racing at speed: " + this.speed + " km/h");
	}

}
//class sportcar ends here


class Test {
	public static void main(String[] args) {
		
		Racer r ;
		r = new SportCar("Ferrari", 220);
		r.toRace();
	}
	//main ends here
}
//class test ends here
