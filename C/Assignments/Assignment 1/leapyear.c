#include<stdio.h>
void main()
{
	int year=2000;
	
	if ((year%4==0 && year%100!=0) || (year%400==0))
	{
		printf("%d is leap year",year);
	}
	else
	{
		printf("%d is not leap year",year);
	}
	
}