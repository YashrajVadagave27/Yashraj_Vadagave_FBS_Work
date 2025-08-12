#include<stdio.h>

void eligibleORnot();//fun_decl

void main()
{
	eligibleORnot();//fun_call
}

void eligibleORnot()//fun_def
{
	int age; 
	printf("enter your age: ");
	scanf("%d",&age);
	
	if(age>=18)
	{
		printf("Eligible for vote");
	}
	else
	{
		printf("Not Eligible for vote");
	}
}