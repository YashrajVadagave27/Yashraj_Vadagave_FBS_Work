class Printer
{
	void print()
	{
		System.out.println("hello");
	}
	
	void print(int a)
	{
		System.out.println("Integer is : "+a);
	}
	void print(char a)
	{
		System.out.println("Character is : "+a);
	}
	void print(String str)
	{
		System.out.println("String is : "+str);
	}
	void print(String str, int a)
	{
		System.out.println("String is : "+str+" Integer is : "+a);
	}
	void print(int a, String str)
	{
		System.out.println("Integer is : "+a+" String is : "+str);
	}
	
}//Printer ends here 

class Test 
{
	public static void main(String[] args )
	{
		Printer p1 = new Printer();
		p1.print();
		p1.print(10);
		p1.print('A');
		p1.print("Yashraj");
		p1.print("Yashraj",27);
		p1.print(27,"Yashraj");

	}//main ends here 
}
//Class Test ends here