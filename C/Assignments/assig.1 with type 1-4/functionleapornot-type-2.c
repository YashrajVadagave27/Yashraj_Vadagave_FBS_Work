#include<stdio.h>

int leapORnot();//fun_decl

void main()
{
	int res = leapORnot();//fun_call
	(res==1) ? printf("Leap year") : printf("Not leap year");
}

int leapORnot()//fun_def
{
	int year,flag=0; 
	printf("enter year: ");
	scanf("%d",&year);
	
	if((year%4==0 && year%100!=0) || year%400==0)
	{
		flag=1;
	}
	else
	{
		flag=0;
	}
	return flag;
}