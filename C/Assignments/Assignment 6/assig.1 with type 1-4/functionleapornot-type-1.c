#include<stdio.h>

void leapORnot();//fun_decl

void main()
{
	leapORnot();//fun_call
}

void leapORnot()//fun_def
{
	int year; 
	printf("enter year: ");
	scanf("%d",&year;
	
	if((year%4==0 && year%100!=0) || year%400==0)
	{
		printf("%d is leap year",year);
	}
	else
	{
		printf("%d is not leap year",year);
	}
}