#include<stdio.h>
#include<string.h>
struct employee
{
	char name[30];
	double salary;
};

void main()
{
	struct employee e1,e2;
	
	strcpy(e1.name,"Yashraj");
	e1.salary = 60000;
	
	printf("Enter Details of Employee2 (Name, Salary):");
	scanf("%s",e2.name);
	scanf("%lf",&e2.salary);
	
	printf("\nDetails of Employee 1:");
	printf("\nName = %s",e1.name);
	printf("\nSalary = %lf",e1.salary);
	printf("\n\nDetails of Employee 2:");
	printf("\nName = %s",e2.name);
	printf("\nSalary = %lf",e2.salary);
}