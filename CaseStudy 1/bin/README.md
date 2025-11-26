Bank Management System – Java (Console Based)
📌 Project Overview

The Bank Management System is a console-based Java application built using Object-Oriented Programming (OOP) concepts.
The system allows users to:

Create and manage different types of bank accounts

Deposit & withdraw money

Track all transactions

Calculate loan interest

Generate monthly bank reports

Delete accounts safely

This project is ideal for college mini-projects and OOP learning.

🚀 Features

Create Saving, Current, Salary, Loan accounts

Deposit & withdraw with validation

Auto-generated transaction ID and account number

Transaction filtering (Debit / Credit / Both)

Monthly report with account summary

Loan interest calculation

Freeze salary account after 2 months

Delete account with log update

🧱 OOP Concepts Used 
✔ Class & Object

Used to model accounts, transactions, and bank system.

✔ Constructor

Initializes account details and creates "Account Created" transaction automatically.

✔ this Keyword

Refers to current object’s variables inside constructors and methods.

✔ super Keyword

Used in child classes to call parent class constructor.

✔ Inheritance

All account types extend the parent Account1 class.

✔ Polymorphism

Parent reference holds child object, and withdraw() behaves differently for each account type.

✔ Abstract Class

Account1 is abstract because withdraw rules differ for each account type.

✔ Arrays

Used to store up to 80 accounts and 200 transactions.

✔ Enum

Used for transaction types like DEBIT, CREDIT, ACCOUNT_CREATED, etc.

📂 Project Structure
Main.java
 ├── TransactionType1 (enum)
 ├── Transaction1
 ├── TransactionManager1
 ├── Account1 (abstract class)
 │     ├── SavingAccount1
 │     ├── CurrentAccount1
 │     ├── SalaryAccount1
 │     └── LoanAccount1
 └── Bank1

📌 FULL SAMPLE OUTPUT
===== BANK MENU =====
1. Create Account
2. Deposit
3. Withdraw
4. Show Transactions
5. Check Balance
6. Monthly Report
7. Calculate Interest
8. Delete Account
9. Exit
Enter choice: 1

Choose Account Type:
1. Saving
2. Current
3. Salary
4. Loan
Enter Type: 1
Enter Owner Name: Rahul Sharma
Enter Opening Balance: 5000
Account Created Successfully!
Account Number: 123456


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
Enter choice: 4
Enter Account Number: 123456
1. Debit
2. Credit
3. Both
Enter choice: 3

----- Transactions -----
TXN10001 | ACCOUNT_CREATED | 5000 | 2025-11-26
TXN10002 | CREDIT | 2000 | 2025-11-26
TXN10003 | DEBIT | 1500 | 2025-11-26


===== BANK MENU =====
Enter choice: 5
Enter Account Number: 123456
Current Balance: 5500


===== BANK MENU =====
Enter choice: 6
Enter Month: 11
Enter Year: 2025

========= MONTHLY REPORT =========
Total Accounts Created: 1

Saving Accounts : 1
Current Accounts: 0
Salary Accounts : 0
Loan Accounts   : 0

Account Number : 123456  
Owner Name     : Rahul Sharma  
Balance        : 5500  
Account Type   : SavingAccount1  
Created On     : 2025-11-26  


===== BANK MENU =====
Enter choice: 8
Enter Account Number to Delete: 123456
Account Deleted Successfully!


===== BANK MENU =====
Enter choice: 9
Thank you for using the Banking System!

▶ How to Run

Save all code in Main.java

Compile:

javac Main.java


Run:

java Main

📌 Conclusion

This project demonstrates strong understanding of:

Abstraction

Polymorphism

Inheritance

Constructors

Transaction handling

Real-world banking workflows

Useful for resumes, interviews, and academic submissions.