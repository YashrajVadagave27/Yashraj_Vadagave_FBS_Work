import java.util.Scanner;
class BankAccount
{
	int accountNo;
	String accountHolderName;
	double currentBalance;
	double interestRate;
	
	//default constructor
	BankAccount(){
		this.accountNo = 1234;
		this.accountHolderName = "Yashraj";
		this.currentBalance = 150000.0;
		this.interestRate = 10.0;
	}

	//parameterised constructor
	BankAccount(int a, String b, double c, double d){
		this.accountNo = a;
		this.accountHolderName = b;
		this.currentBalance = c;
		this.interestRate = d;
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
	void setinterestRate(double a){
		this.interestRate = a;
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
class Test
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

		System.out.println("Enter Interest Rate: ");
		double d = sc.nextDouble();
		
		System.out.println("Default Constructor Output");
		BankAccount b = new BankAccount();
		b.display();
		
		System.out.println("Parameterised Constructor Output");
		BankAccount b1 = new BankAccount(a, b2, c, d);
		b1.display();
		
		System.out.println("Enter Account Number: ");
		int a1 = sc.nextInt();
		
		System.out.println("Enter Account Holder Name: ");
		String b11 = sc.next();

		System.out.println("Enter Current Balance: ");
		double c1 = sc.nextDouble();

		System.out.println("Enter Interest Rate: ");
		double d1 = sc.nextDouble();
		
		System.out.println("Setter Getter Output");
		b.setaccountNo(a1);
		b.setaccountHolderName(b11);
		b.setcurrentBalance(c1);
		b.setinterestRate(d1);
		b.display();
	}//main ends here
}//class test ends here