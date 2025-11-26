import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

enum TransactionType1 {
    DEBIT,
    CREDIT,
    FUND_TRANSFER,
    LOAN_REPAYMENT,
    INTEREST_CALCULATION,
    ACCOUNT_CREATED,
    ACCOUNT_CLOSED,
    OTHER
}

class Transaction1 {
    String transactionId;
    double amount;
    TransactionType1 type;
    LocalDate date;
    String description;
    String relatedAccount;

    public Transaction1(double amount, TransactionType1 type, String description, String relatedAccount) {
        this.transactionId = "TXN" + System.currentTimeMillis();
        this.amount = amount;
        this.type = type;
        this.date = LocalDate.now();
        this.description = description;
        this.relatedAccount = relatedAccount;
    }

    public boolean matchAccount(String accNo) {
        return relatedAccount.equals(accNo);
    }

    public void printTransaction() {
        System.out.println("Transaction ID: " + transactionId +
                " | Type: " + type +
                " | Amount: " + amount +
                " | Date: " + date +
                " | Description: " + description);
    }
}

class TransactionManager1 {
    Transaction1[] transactions = new Transaction1[200];
    int count = 0;

    public void addTransaction(Transaction1 t) {
        transactions[count++] = t;
    }

    public void printTransactionsForAccount(String accNo, int filterType) {
        System.out.println("----- Transactions for Account: " + accNo + " -----");
        boolean any = false;

        for (int i = 0; i < count; i++) {
            if (transactions[i].matchAccount(accNo)) {

                if (filterType == 1 && transactions[i].type != TransactionType1.DEBIT)
                    continue;
                if (filterType == 2 && transactions[i].type != TransactionType1.CREDIT)
                    continue;

                transactions[i].printTransaction();
                any = true;
            }
        }

        if (!any) {
            System.out.println("No transactions found based on selection.");
        }
    }

    public void getMonthlySummary(int month, int year) {
        System.out.println("----- Monthly Transaction Summary (" + month + "/" + year + ") -----");
        boolean any = false;
        for (int i = 0; i < count; i++) {
            if (transactions[i].date.getMonthValue() == month &&
                    transactions[i].date.getYear() == year) {
                transactions[i].printTransaction();
                any = true;
            }
        }
        if (!any) {
            System.out.println("No transactions found in this month.");
        }
    }
}

abstract class Account1 {

    String accountNumber;
    String ownerName;
    double balance;
    LocalDate lastTransactionDate;
    TransactionManager1 tm;
    LocalDate creationDate;

    public Account1(String ownerName, double balance, TransactionManager1 tm) {

        Random r = new Random();
        this.accountNumber = String.valueOf(100000 + r.nextInt(900000));

        this.ownerName = ownerName;
        this.balance = balance;
        this.tm = tm;
        this.creationDate = LocalDate.now();
        this.lastTransactionDate = LocalDate.now();

        tm.addTransaction(new Transaction1(balance, TransactionType1.ACCOUNT_CREATED,
                "Account created", accountNumber));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    void updateTransactionDate() {
        lastTransactionDate = LocalDate.now();
    }

    public void deposit(double amount) {
        balance += amount;
        updateTransactionDate();
        tm.addTransaction(new Transaction1(amount, TransactionType1.CREDIT, "Deposit", accountNumber));
        System.out.println("Deposit successful. New Balance: " + balance);
    }

    public abstract void withdraw(double amount);
}

class SavingAccount1 extends Account1 {
    double minBalance = 1000;

    public SavingAccount1(String ownerName, double balance, TransactionManager1 tm) {
        super(ownerName, balance, tm);
    }

    public void withdraw(double amount) {
        if (balance - amount < minBalance) {
            System.out.println("Withdrawal failed. Minimum balance required.");
            return;
        }
        balance -= amount;
        updateTransactionDate();
        tm.addTransaction(new Transaction1(amount, TransactionType1.DEBIT, "Withdrawal", accountNumber));
        System.out.println("Withdrawal successful. New Balance: " + balance);
    }
}

class CurrentAccount1 extends Account1 {
    double overdraftLimit = 5000;

    public CurrentAccount1(String ownerName, double balance, TransactionManager1 tm) {
        super(ownerName, balance, tm);
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit < amount) {
            System.out.println("Withdrawal failed. Overdraft limit exceeded.");
            return;
        }
        balance -= amount;
        updateTransactionDate();
        tm.addTransaction(new Transaction1(amount, TransactionType1.DEBIT, "Withdrawal", accountNumber));
        System.out.println("Withdrawal successful. New Balance: " + balance);
    }
}

class SalaryAccount1 extends Account1 {
    int monthsLimit = 2;

    public SalaryAccount1(String ownerName, double balance, TransactionManager1 tm) {
        super(ownerName, balance, tm);
    }

    public void withdraw(double amount) {
        Period diff = Period.between(lastTransactionDate, LocalDate.now());
        int months = diff.getYears() * 12 + diff.getMonths();

        if (months > monthsLimit) {
            System.out.println("Account Frozen! No transaction within last 2 months.");
            return;
        }
        if (balance < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        updateTransactionDate();
        tm.addTransaction(new Transaction1(amount, TransactionType1.DEBIT, "Withdrawal", accountNumber));
        System.out.println("Withdrawal successful. New Balance: " + balance);
    }
}

class LoanAccount1 extends Account1 {
    double loanAmount;
    double interestRate = 0.05;

    public LoanAccount1(String ownerName, double loanAmount, TransactionManager1 tm) {
        super(ownerName, 0, tm);
        this.loanAmount = loanAmount;
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed in Loan Account.");
    }

    public void calculateInterest() {
        double interest = loanAmount * interestRate;
        tm.addTransaction(new Transaction1(interest, TransactionType1.INTEREST_CALCULATION,
                "Loan interest added", accountNumber));
        System.out.println("Interest calculated: " + interest);
    }
}

class Bank1 {
    Account1[] accounts = new Account1[80];
    int count = 0;

    public void addAccount(Account1 acc) {
        accounts[count++] = acc;
    }

    public Account1 getAccount(String accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accNo)) {
                return accounts[i];
            }
        }
        return null;
    }

    public boolean deleteAccount(String accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accNo)) {

                accounts[i].tm.addTransaction(
                        new Transaction1(0, TransactionType1.ACCOUNT_CLOSED,
                                "Account Deleted", accNo));

                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }

                accounts[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public void getMonthlyReport(int month, int year) {

        int saving = 0, current = 0, salary = 0, loan = 0, total = 0;

        System.out.println("\n=========== MONTHLY BANK REPORT (" + month + "/" + year + ") ===========");

        for (int i = 0; i < count; i++) {

            if (accounts[i].creationDate.getMonthValue() == month &&
                    accounts[i].creationDate.getYear() == year) {

                total++;

                if (accounts[i] instanceof SavingAccount1) saving++;
                else if (accounts[i] instanceof CurrentAccount1) current++;
                else if (accounts[i] instanceof SalaryAccount1) salary++;
                else if (accounts[i] instanceof LoanAccount1) loan++;
            }
        }

        if (total == 0) {
            System.out.println("No accounts created in this month.");
            return;
        }

        System.out.println("Total Accounts Created: " + total);
        System.out.println("\nSaving Accounts : " + saving);
        System.out.println("Current Accounts: " + current);
        System.out.println("Salary Accounts : " + salary);
        System.out.println("Loan Accounts   : " + loan);

        System.out.println("\n----- Account Details -----");

        for (int i = 0; i < count; i++) {

            if (accounts[i].creationDate.getMonthValue() == month &&
                    accounts[i].creationDate.getYear() == year) {

                System.out.println("Account Number : " + accounts[i].getAccountNumber() +
                        " | Account Holder Name : " + accounts[i].ownerName +
                        " | Current Balance : " + accounts[i].balance +
                        " | Account Type : " + accounts[i].getClass().getSimpleName() +
                        " | Created On : " + accounts[i].getCreationDate());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TransactionManager1 tm = new TransactionManager1();
        Bank1 bank = new Bank1();

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Transactions");
            System.out.println("5. Check Balance");
            System.out.println("6. Monthly Bank Report");
            System.out.println("7. Calculate Interest");
            System.out.println("8. Delete Account");
            System.out.println("9. Transfer Money");  // NEW OPTION ADDED
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("1. Saving");
                    System.out.println("2. Current");
                    System.out.println("3. Salary");
                    System.out.println("4. Loan");
                    System.out.print("Enter Type: ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Owner Name: ");
                    String name = sc.nextLine();

                    if (type == 4) {
                        System.out.print("Enter Loan Amount: ");
                        double loanAmt = sc.nextDouble();
                        LoanAccount1 la = new LoanAccount1(name, loanAmt, tm);
                        bank.addAccount(la);
                        System.out.println("Loan Account Created. Account No: " + la.getAccountNumber());
                    } else {
                        System.out.print("Enter Opening Balance: ");
                        double bal = sc.nextDouble();
                        Account1 acc = null;

                        if (type == 1) acc = new SavingAccount1(name, bal, tm);
                        else if (type == 2) acc = new CurrentAccount1(name, bal, tm);
                        else if (type == 3) acc = new SalaryAccount1(name, bal, tm);

                        bank.addAccount(acc);
                        System.out.println("Account Created. Account No: " + acc.getAccountNumber());
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    sc.nextLine();
                    String dAcc = sc.nextLine();
                    Account1 a1 = bank.getAccount(dAcc);
                    if (a1 == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }
                    System.out.print("Enter Amount: ");
                    double dAmount = sc.nextDouble();
                    a1.deposit(dAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    sc.nextLine();
                    String wAcc = sc.nextLine();
                    Account1 a2 = bank.getAccount(wAcc);
                    if (a2 == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }
                    System.out.print("Enter Amount: ");
                    double wAmt = sc.nextDouble();
                    a2.withdraw(wAmt);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    sc.nextLine();
                    String tAcc = sc.nextLine();

                    System.out.println("\nChoose Transaction Type to Display:");
                    System.out.println("1. Debit Only");
                    System.out.println("2. Credit Only");
                    System.out.println("3. Both");
                    System.out.print("Enter choice: ");
                    int filter = sc.nextInt();

                    System.out.print("Total Transaction Count : " + tm.count + "\n");
                    tm.printTransactionsForAccount(tAcc, filter);
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    sc.nextLine();
                    String bAcc = sc.nextLine();
                    Account1 a3 = bank.getAccount(bAcc);
                    if (a3 != null) {
                        System.out.println("Current Balance: " + a3.balance);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Month (1-12): ");
                    int m = sc.nextInt();
                    System.out.print("Enter Year: ");
                    int y = sc.nextInt();
                    bank.getMonthlyReport(m, y);
                    break;

                case 7:
                    System.out.print("Enter Account Number: ");
                    sc.nextLine();
                    String iAcc = sc.nextLine();
                    Account1 a4 = bank.getAccount(iAcc);
                    if (a4 instanceof LoanAccount1) {
                        ((LoanAccount1) a4).calculateInterest();
                    } else {
                        System.out.println("No interest available for this account.");
                    }
                    break;

                case 8:
                    System.out.print("Enter Account Number to Delete: ");
                    sc.nextLine();
                    String delAcc = sc.nextLine();

                    boolean removed = bank.deleteAccount(delAcc);

                    if (removed)
                        System.out.println("Account Deleted Successfully!");
                    else
                        System.out.println("Account Not Found!");
                    break;

                case 9: 
                    sc.nextLine();
                    System.out.print("Enter Sender Account Number: ");
                    String senderAcc = sc.nextLine();

                    System.out.print("Enter Receiver Account Number: ");
                    String receiverAcc = sc.nextLine();

                    Account1 sender = bank.getAccount(senderAcc);
                    Account1 receiver = bank.getAccount(receiverAcc);

                    if (sender == null || receiver == null) {
                        System.out.println("Invalid account number(s)!");
                        break;
                    }

                    System.out.print("Enter Transfer Amount: ");
                    double tAmt = sc.nextDouble();

                    if (sender.balance < tAmt) {
                        System.out.println("Insufficient balance!");
                        break;
                    }

                    sender.balance -= tAmt;
                    sender.tm.addTransaction(new Transaction1(tAmt, TransactionType1.DEBIT,
                            "Fund Transfer to " + receiverAcc, senderAcc));

                    receiver.balance += tAmt;
                    receiver.tm.addTransaction(new Transaction1(tAmt, TransactionType1.FUND_TRANSFER,
                            "Fund Transfer from " + senderAcc, receiverAcc));

                    System.out.println("Transfer Successful!");
                    break;

                case 10:
                    System.out.println("Goodbye");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
