class Car
{
	int model , price , fewlCapacity;
	String brand , color ;

	void setModel( int m){
		this.model = m;
	}
	void setPrice(int p){
		this.price = p;
	}
	void setFewlCapacity(int c){
		this.fewlCapacity = c;
	}
	void setBrand(String b){
		this.brand = b;
	}
	void setColor(String s){
		this.color = s;
	}
}//car ends here 

class TestCar
{
	public static void main(String[] args)
	{
		Car c1;
		c1 = new Car();
		c1.setModel(2016);
		c1.setPrice(150000);
		c1.setFewlCapacity(50);
		c1.setBrand("nano");
		c1.setColor("red");

	System.out.println("Model is : " + c1.model);
	System.out.println("Price is : " + c1.price);
	System.out.println("FewlCapacity : " + c1.fewlCapacity);
	System.out.println("Brand : " + c1.brand);
	System.out.println("Color : " + c1.color);

	}//main ends here 
}// TestCar ends here