import java.time.LocalDate;
import java.time.Period;

abstract class BankAccount {
    int accNo;
    String holderName;
    double balance;
    static int accountCount = 0;
    int wAmount;

    BankAccount() {
        System.out.println("BankAccount Default Constructor Called");
        this.accNo = 1001;
        this.holderName = "Yashraj";
        this.balance = 50000;
        this.wAmount = 2000;
        accountCount++;
    }

    BankAccount(int acc, String name, double bal, int wAmt) {
        System.out.println("BankAccount Parameterized Constructor Called");
        this.accNo = acc;
        this.holderName = name;
        this.balance = bal;
        this.wAmount = wAmt;
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

    int getwAmount() {
        return wAmount;
    }

    void setwAmount(int wAmount) {
        this.wAmount = wAmount;
    }

    abstract void withdraw();

    void display() {
        System.out.println("Account No: " + this.accNo);
        System.out.println("Holder Name: " + this.holderName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Withdraw Amount: " + this.wAmount);
    }
}//BankAccount ends here

class Saving extends BankAccount {
    double interestRate;
    double withdrawLimit;

    Saving() {
        super();
        System.out.println("Saving Default Constructor Called");
        this.interestRate = 4.5;
        this.withdrawLimit = 10000;
    }

    Saving(int acc, String name, double bal, int wAmt, double rate, double limit) {
        super(acc, name, bal, wAmt);
        System.out.println("Saving Parameterized Constructor Called");
        this.interestRate = rate;
        this.withdrawLimit = limit;
    }

    double getInterestRate() {
        return interestRate;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double getWithdrawLimit() {
        return withdrawLimit;
    }

    void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    void withdraw() {
        if (this.wAmount <= this.withdrawLimit && this.wAmount <= this.balance) {
            this.balance -= this.wAmount;
            System.out.println(this.wAmount+" Withdrawal Successful.\nRemaining Balance: " + this.balance);
        } 
        else {
            System.out.println("Withdrawal Failed!!!\nAmount exceeds limit or insufficient balance.");
        }
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + this.interestRate + "%");
        System.out.println("Withdraw Limit: " + this.withdrawLimit);
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

    Current(int acc, String name, double bal, int wAmt, double limit) {
        super(acc, name, bal, wAmt);
        System.out.println("Current Parameterized Constructor Called");
        this.overdraftLimit = limit;
    }

    double getOverdraftLimit() {
        return overdraftLimit;
    }

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    void withdraw() {
        if (this.wAmount <= (this.balance + this.overdraftLimit)) {
            this.balance -= this.wAmount;
            System.out.println(this.wAmount+" Withdrawal Successful.\nRemaining Balance: " + this.balance);
        } 
        else {
            System.out.println("Withdrawal Failed!!!\nAmount exceeds overdraft limit.");
        }
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + this.overdraftLimit);
        System.out.println();
    }
}//current ends here

class Salary extends BankAccount {
    LocalDate lastTransactionDate;

    Salary() {
        super();
        System.out.println("Salary Default Constructor Called");
        this.lastTransactionDate = LocalDate.now().minusMonths(1);
    }

    Salary(int acc, String name, double bal, int wAmt, LocalDate lastDate) {
        super(acc, name, bal, wAmt);
        System.out.println("Salary Parameterized Constructor Called");
        this.lastTransactionDate = lastDate;
    }

    LocalDate getLastTransactionDate() {
        return lastTransactionDate;
    }

    void setLastTransactionDate(LocalDate lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    void withdraw() {
        LocalDate today = LocalDate.now();
        Period diff = Period.between(this.lastTransactionDate, today);
        int monthsDiff = diff.getMonths() + (diff.getYears() * 12);

        if (monthsDiff > 2){
        	int month = monthsDiff % 12;
        	int year = monthsDiff / 12;
            System.out.println("Cannot Withdraw!!!\nLast transaction is "+year+" year "+month+" month older.\nWe want month difference between last transaction date is less than 2 month.");
        } 
        else if (this.wAmount <= this.balance) {
            this.balance -= this.wAmount;
            this.lastTransactionDate = LocalDate.now();
            System.out.println(this.wAmount+" Withdrawal Successful.\nRemaining Balance: " + this.balance);
        } 
        else {
            System.out.println("Insufficient Balance.");
        }
    }

    void display() {
        super.display();
        System.out.println("Last Transaction Date: " + this.lastTransactionDate);
        System.out.println();
    }
}//salary ends here

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount[] ba = new BankAccount[3];

        ba[0] = new Saving();
        ba[1] = new Current(2001, "Raj", 75000, 8000, 30000);

        ba[2] = new Salary(3001, "Meera", 90000, 15000, LocalDate.of(2024, 10, 10)); //LocalDate.of(int year, int month, int day)

        for (int i = 0; i < ba.length; i++) {
        	System.out.println();
            ba[i].display();
            ba[i].withdraw();
        }

        System.out.println("\nTotal Account Count: " + BankAccount.getAccountCount());
    }
}
