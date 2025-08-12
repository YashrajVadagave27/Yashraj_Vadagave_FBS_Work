#include<stdio.h>

int eligibleORnot(int);//fun_decl

void main()
{
	int age;
	printf("enter your age: ");
	scanf("%d",&age);
	int res = eligibleORnot(age);//fun_call
	(res==1) ? printf("Eligible for vote") : printf("Not Eligible for vote");
}

int eligibleORnot(int age)//fun_def
{
	int status=0; 
	
	if(age>=18)
	{
		status=1;
	}
	else
	{
		status=0;
	}
	return status;
}