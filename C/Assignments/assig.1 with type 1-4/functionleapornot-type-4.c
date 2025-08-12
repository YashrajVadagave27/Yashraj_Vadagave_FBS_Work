#include<stdio.h>

int leapORnot(int);//fun_decl

void main()
{
	int year;
	printf("enter year: ");
	scanf("%d",&year);
	int res = leapORnot(year);//fun_call
	(res==1) ? printf("Leap year") : printf("Not leap year");
}

int leapORnot(int year)//fun_def
{
	int flag=0; 
	
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