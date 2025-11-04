class HR 
{
	int Id;
	String Name;
	double Salary;
	double Commission ;

	void setID(int i){
		this.Id = i;
	}
	void setName(String n){
		this.Name = n;
	}
	void setSalary(double s){
		this.Salary = s;
	}
	void setCommission(double c){
		this.Commission = c;
	}
}// hr ends here

class TestHr
{
	public static void main(String[]  args){
		HR h1;
		h1 = new HR();

		h1.setID(101);
		h1.setName("Sandip");
		h1.setSalary(20000.0);
		h1.setCommission(12.3);
	
	System.out.println("Id is : " + h1.Id);
	System.out.println("Name is : " + h1.Name);
	System.out.println("Salary is : " + h1.Salary);
	System.out.println("Commission is : " + h1.Commission);
	}// main ends here
}// TestHr ends here