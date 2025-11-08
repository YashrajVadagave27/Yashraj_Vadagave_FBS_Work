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
		Date[] arr = new Date[3];
		arr[0] = new Date();
		arr[1] = new Date(7, 11, 2025, "Friday");
		arr[2] = new Date();
		for(int i = 0; i<arr.length ; i++)
		{
			arr[i].display();
		}

	}//main ends here 
}
//Class Test ends here