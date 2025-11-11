class BankAccount {
    int accNo;
    String holderName;
    double balance;
    static int accountCount = 0;

    BankAccount() {
        System.out.println("BankAccount Default Constructor Called");
        this.accNo = 1001;
        this.holderName = "Yashraj";
        this.balance = 50000;
        accountCount++;
    }

    BankAccount(int acc, String name, double bal) {
        System.out.println("BankAccount Parameterized Constructor Called");
        this.accNo = acc;
        this.holderName = name;
        this.balance = bal;
        accountCount++;
    }
    
    int getAccNo() {
		return accNo;
	}

	void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	String getHolderName() {
		return holderName;
	}

	void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
	
	static int getAccountCount() {
		return accountCount;
	}

	void display() {
        System.out.println("Account No: " + this.accNo);
        System.out.println("Holder Name: " + this.holderName);
        System.out.println("Balance: " + this.balance);
    }
}

class Saving extends BankAccount {
    double interestRate;

    Saving() {
        super();
        System.out.println("Saving Default Constructor Called");
        this.interestRate = 4.5;
    }

    Saving(int acc, String name, double bal, double rate) {
        super(acc, name, bal);
        System.out.println("Saving Parameterized Constructor Called");
        this.interestRate = rate;
    }

    double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	void display() {
        super.display();
        System.out.println("Interest Rate: " + this.interestRate + "%");
        System.out.println();
    }
}//saving ends here

class Current extends BankAccount {
    double overdraftLimit;

    Current() {
        super();
        System.out.println("Current Default Constructor Called");
        this.overdraftLimit = 25000;
    }

    Current(int acc, String name, double bal, double limit) {
        super(acc, name, bal);
        System.out.println("Current Parameterized Constructor Called");
        this.overdraftLimit = limit;
    }

    double getOverdraftLimit() {
		return overdraftLimit;
	}

	void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	void display() {
        super.display();
        System.out.println("Overdraft Limit: " + this.overdraftLimit);
        System.out.println();
    }
}//current ends here

class BankAccountMain {
    public static void main(String[] args) {
        Saving s = new Saving();
        s.display();

        Current c = new Current(2001, "Raj", 75000, 30000);
        c.display();
        
        System.out.println("Total ACcount Count : " + BankAccount.getAccountCount());

    }//main ends here
}//bankaccountmain ends here
