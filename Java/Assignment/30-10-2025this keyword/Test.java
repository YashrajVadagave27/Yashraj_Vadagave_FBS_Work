class Date
{
	int day , month , year ;
	String dow ; 
	
	void setDay(int d){
		this.day = d;
	}
	
	void setMonth(int m){
		this.month = m;
	}

	void setYear(int y){
		this.year = y;
	}

	void setDow(String str){
		this.dow = str;
	}	
}
//Class date ends here 

class Test 
{
	public static void main(String[] args )
	{
		Date d1 ;
		d1 = new Date();
		d1.setDay(31);
		d1.setMonth(10);
		d1.setYear(2025);
		d1.setDow("Friday");

		System.out.println("Date is : " + d1.day + "/" + d1.month + "/" + d1.year);
		System.out.println("Day is : " + d1.dow);
	}//main ends here 
}
//Class Test ends here