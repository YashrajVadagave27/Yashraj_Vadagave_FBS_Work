import java.util.Scanner;
class BankAccount
{
	int accountNo;
	String accountHolderName;
	double currentBalance;
	static double interestRate;

	static{
		interestRate = 12.5;
	}
	
	//default constructor
	BankAccount(){
		this.accountNo = 1234;
		this.accountHolderName = "Yashraj";
		this.currentBalance = 150000.0;
		//this.interestRate = 10.0;
	}

	//parameterised constructor
	BankAccount(int a, String b, double c){
		this.accountNo = a;
		this.accountHolderName = b;
		this.currentBalance = c;
		//this.interestRate = d;
	}

	//setter start here
	void setaccountNo(int a){
		this.accountNo = a;
	}
	void setaccountHolderName(String a){
		this.accountHolderName = a;
	}
	void setcurrentBalance(double a){
		this.currentBalance = a;
	}
	static void setinterestRate(double a){
		interestRate = a;
	}//setter ends here

	//getter start here
	int getaccountNo(){
		return this.accountNo;
	}
	String getaccountHolderName(){
		return this.accountHolderName;
	}
	double getcurrentBalance(){
		return this.currentBalance;
	}
	double getinterestRate(){
		return this.interestRate;
	}//getter ends here
	
	void display(){
		System.out.println("Account Number : " + getaccountNo());
		System.out.println("Account Holder Name : " + getaccountHolderName());
		System.out.println("Current Balance : "+ getcurrentBalance());
		System.out.println("Interest Rate : " + getinterestRate());
	}//display ends here
}//class bankaccount ends here
class Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Account Holder Name: ");
		String b2 = sc.next();

		System.out.println("Enter Current Balance: ");
		double c = sc.nextDouble();

		//System.out.println("Enter Interest Rate: ");
		//double d = sc.nextDouble();
		
		System.out.println("\nDefault Constructor Output");
		BankAccount b = new BankAccount();
		b.display();
		
		System.out.println("\nParameterised Constructor Output");
		BankAccount b1 = new BankAccount(a, b2, c);
		b1.display();
		
		System.out.println("\nEnter Account Number: ");
		int a1 = sc.nextInt();
		
		System.out.println("Enter Account Holder Name: ");
		String b11 = sc.next();

		System.out.println("Enter Current Balance: ");
		double c1 = sc.nextDouble();

		//System.out.println("Enter Interest Rate: ");
		//double d1 = sc.nextDouble();
		
		System.out.println("\nSetter Getter Output");
		BankAccount b3 = new BankAccount();
		b3.setaccountNo(a1);
		b3.setaccountHolderName(b11);
		b3.setcurrentBalance(c1);
		b3.display();

		BankAccount.setinterestRate(7.8);
	
		System.out.println("\nAfter static function called");
		b3.display();
		System.out.println("\n");
		b.display();
		System.out.println("\n");
		b1.display();
	}//main ends here
}//class test1 ends here