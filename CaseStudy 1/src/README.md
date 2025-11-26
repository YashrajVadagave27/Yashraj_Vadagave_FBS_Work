Banking Management System – Java (Console-Based)
📌 Project Description

This project is a console-based banking management system implemented in Java following the MVC (Model–View–Controller) architecture.
It manages different account types, transactions, monthly summaries, fund transfers, and account lifecycle activities.
The project uses arrays (no collections) for data storage and supports full transaction tracking.

📌 Project Architecture – MVC
1. Model

Contains all business classes:

Account1 (abstract)

SavingAccount1

CurrentAccount1

SalaryAccount1

LoanAccount1

Transaction1

2. Controller

Handles logic and processing:

TransactionManager1 – stores & filters transactions

Bank1 – manages accounts & monthly reports

3. View

Main class

Provides console-based user interface (menu-driven)

📌 Features & Functionalities
✔ Account Management

Create accounts (Saving, Current, Salary, Loan)

Delete account

Automatic account number generation

Minimum balance, overdraft & salary freeze rules

✔ Transactions

Deposit

Withdraw

View debit / credit / all transactions

Monthly transaction summary

Fund Transfer (with transaction logs)

✔ Reports

Check balance

Monthly bank report

Loan interest calculation

✔ Storage

Uses arrays for storing:

Accounts (Account1[80])

Transactions (Transaction1[200])

📌 Technology Used
Component	Details
Language	Java
IDE	VS Code / IntelliJ IDEA / Eclipse
Storage	Arrays (No Collections)
Interface	Console-based CLI
📌 How to Run the Program
Steps

Copy all .java files into a single folder.

Open terminal in that folder.

Compile using:

javac Main.java


Run using:

java Main


Choose options from the menu to perform banking operations.

📌 FULL SAMPLE OUTPUT (OFFICIAL)
===== BANK MENU =====
1. Create Account
2. Deposit
3. Withdraw
4. Show Transactions
5. Check Balance
6. Monthly Bank Report
7. Calculate Interest
8. Delete Account
9. Transfer Money
10. Exit
Enter choice: 1

1. Saving
2. Current
3. Salary
4. Loan
Enter Type: 1
Enter Owner Name: Rahul Sharma
Enter Opening Balance: 5000
Account Created. Account No: 123456

===== BANK MENU =====
Enter choice: 2
Enter Account Number: 123456
Enter Amount: 2000
Deposit successful. New Balance: 7000

===== BANK MENU =====
Enter choice: 3
Enter Account Number: 123456
Enter Amount: 1500
Withdrawal successful. New Balance: 5500

===== BANK MENU =====
Enter choice: 1
Enter Type: 2
Enter Owner Name: Akash Verma
Enter Opening Balance: 3000
Account Created. Account No: 654321

===== BANK MENU =====
Enter choice: 9
Enter Sender Account Number: 123456
Enter Receiver Account Number: 654321
Enter Transfer Amount: 2000
Transfer Successful!

===== BANK MENU =====
Enter choice: 4
Enter Account Number: 123456
1. Debit Only
2. Credit Only
3. Both
Enter choice: 3
Total Transaction Count : 5
----- Transactions for Account: 123456 -----
Transaction ID: TXN1711400000000 | Type: ACCOUNT_CREATED | Amount: 5000 | Date: 2025-11-26 | Description: Account created
Transaction ID: TXN1711405000000 | Type: CREDIT | Amount: 2000 | Date: 2025-11-26 | Description: Deposit
Transaction ID: TXN1711408000000 | Type: DEBIT | Amount: 1500 | Date: 2025-11-26 | Description: Withdrawal
Transaction ID: TXN1711409000000 | Type: DEBIT | Amount: 2000 | Date: 2025-11-26 | Description: Fund Transfer to 654321

===== BANK MENU =====
Enter choice: 6
Enter Month (1-12): 11
Enter Year: 2025

=========== MONTHLY BANK REPORT (11/2025) ===========
Total Accounts Created: 2

Saving Accounts : 1
Current Accounts: 1
Salary Accounts : 0
Loan Accounts   : 0

----- Account Details -----
Account Number : 123456 | Account Holder Name : Rahul Sharma | Current Balance : 3500 | Account Type : SavingAccount1 | Created On : 2025-11-26
Account Number : 654321 | Account Holder Name : Akash Verma | Current Balance : 5000 | Account Type : CurrentAccount1 | Created On : 2025-11-26

===== BANK MENU =====
Enter choice: 10
Goodbye