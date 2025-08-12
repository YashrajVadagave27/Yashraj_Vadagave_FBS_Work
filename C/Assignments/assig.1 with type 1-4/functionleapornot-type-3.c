#include<stdio.h>

void leapORnot(int);//fun_decl

void main()
{
	int y; 
	printf("enter year: ");
	scanf("%d",&y);
	
	leapORnot(y);//fun_call
}

void leapORnot(int year)//fun_def
{	
	if((year%4==0 && year%100!=0) || year%400==0)
	{
		printf("%d is leap year",year);
	}
	else
	{
		printf("%d is not leap year",year);
	}
}