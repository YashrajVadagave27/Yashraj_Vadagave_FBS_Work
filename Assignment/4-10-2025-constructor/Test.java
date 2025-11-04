class Date
{
	int day , month , year ;
	String dow ; 
	
	Date(){
		System.out.println("constructor called");
		this.day = 4;
		this.month = 8;
		this.year = 1984;
		this.dow = "Saturday";
	}
	Date(int d, int m, int y, String dow){
		System.out.println("parameterised constructor called");
		this.day = d;
		this.month = m;
		this.year = y;
		this.dow = dow;
	}
	// Setter methods
    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setDow(String str) {
        this.dow = str;
    }

    // Getter methods
    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    String getDow() {
        return this.dow;
    }

    // Display method
    void display() {
        System.out.println("Date is : " + getDay() + "/" + getMonth() + "/" + getYear());
        System.out.println("Day is : " + getDow());
    }// display ends here	
}
//Class date ends here 

class Test 
{
	public static void main(String[] args )
	{
		Date d1 = new Date();
		d1.display();
		
		Date d2 = new Date(4,10,2025,"tuesday");
		d2.display();

	}//main ends here 
}
//Class Test ends here