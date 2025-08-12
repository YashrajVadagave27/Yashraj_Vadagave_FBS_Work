#include<stdio.h>

void eligibleORnot(int);//fun_decl

void main()
{
	int a; 
	printf("enter your age: ");
	scanf("%d",&a);
	eligibleORnot(a);//fun_call
}

void eligibleORnot(int age)//fun_def
{	
	if(age>=18)
	{
		printf("Eligible for vote");
	}
	else
	{
		printf("Not Eligible for vote");
	}
}