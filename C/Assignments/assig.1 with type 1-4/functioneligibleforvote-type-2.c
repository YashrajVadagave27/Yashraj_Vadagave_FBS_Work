#include<stdio.h>

int eligibleORnot();//fun_decl

void main()
{
	int res = eligibleORnot();//fun_call
	(res==1) ? printf("Eligible for vote") : printf("Not Eligible for vote");
}

int eligibleORnot()//fun_def
{
	int age, status=0; 
	printf("enter your age: ");
	scanf("%d",&age);
	
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