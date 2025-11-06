class Calculator
{
	//add
	void add(int a, int b)
	{
		int c = a + b;
		System.out.println("Addition is : "+c);
	}
	void add(double a, double b)
	{
		double c = a + b;
		System.out.println("Addition is : "+c);
	}
	void add(int a, double b)
	{
		double c = a + b;
		System.out.println("Addition is : "+c);
	}
	void add(double a, int b)
	{
		double c = a + b;
		System.out.println("Addition is : "+c);
	}
	
	//sub
	void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("Substraction is : "+c);
	}
	void sub(double a, double b)
	{
		double c = a - b;
		System.out.println("Substraction is : "+c);
	}
	void sub(int a, double b)
	{
		double c = a - b;
		System.out.println("Substraction is : "+c);
	}
	void sub(double a, int b)
	{
		double c = a - b;
		System.out.println("Substraction is : "+c);
	}

	//mul
	void mul(int a, int b)
	{
		int c = a * b;
		System.out.println("Multiplication is : "+c);
	}
	void mul(double a, double b)
	{
		double c = a * b;
		System.out.println("Multiplication is : "+c);
	}
	void mul(int a, double b)
	{
		double c = a * b;
		System.out.println("Multiplication is : "+c);
	}
	void mul(double a, int b)
	{
		double c = a * b;
		System.out.println("Multiplication is : "+c);
	}

	//div
	void div(int a, int b)
	{
		int c = a / b;
		System.out.println("Division is : "+c);
	}
	void div(double a, double b)
	{
		double c = a / b;
		System.out.println("Division is : "+c);
	}
	void div(int a, double b)
	{
		double c = a / b;
		System.out.println("Division is : "+c);
	}
	void div(double a, int b)
	{
		double c = a / b;
		System.out.println("Division is : "+c);
	}

}//calculator ends here
class TestCal
{
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		
		//add
		c.add(10,10);
		c.add(10.0,20.0);
		c.add(10,20.0);
		c.add(10.0,15);

		//sub
		c.sub(20,10);
		c.sub(30.0,20.0);
		c.sub(40,20.0);
		c.sub(20.0,15);

		//mul
		c.mul(10,10);
		c.mul(10.0,20.0);
		c.mul(10,20.0);
		c.mul(10.0,15);

		//div
		c.div(10,10);
		c.div(100.0,20.0);
		c.div(20,10.0);
		c.div(10.0,5);

	}//main ends here
}//TestCal ends here