#include<stdio.h>
void main()
{
	int age,salary;
	
	printf("Enter The Age: ");
	scanf("%d",&age);
	
	printf("Enter The Salary: ");
	scanf("%d",&salary);
	
	if(age>=21 && salary>=25000)
		printf("Eligible For Loan");
	else
		printf("Not Eligible For Loan");
}