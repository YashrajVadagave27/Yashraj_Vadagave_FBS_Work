#include <stdio.h>

float deposit(float, float);
float withdraw(float, float);

void main() 
{
    float balance, amount;
    int choice;

    printf("Enter initial amount: ");
    scanf("%f", &balance);

    printf("Enter choice:1. Deposit 2. Withdraw: ");
    scanf("%d", &choice);

    if (choice == 1) 
	{
        printf("Enter amount to deposit: ");
        scanf("%f", &amount);
        balance = deposit(balance, amount);
        printf("Updated Balance: %f", balance);
    } 
    else if (choice == 2) 
	{
        printf("Enter amount to withdraw: ");
        scanf("%f", &amount);
        balance = withdraw(balance, amount);
        printf("Updated Balance: %f", balance);
    } 
    else 
	{
        printf("Invalid choice!");
    }
}

float deposit(float balance, float amount) 
{
    balance += amount;
    return balance;
}

float withdraw(float balance, float amount)
 {
    if (balance < 3000) 
	{
        printf("can't withdraw balance is not sufficient.");
    } 
	else 
	{
        balance -= amount;
    }
    return balance;
}