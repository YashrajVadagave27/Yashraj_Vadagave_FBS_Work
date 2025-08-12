#include<stdio.h>

void fact();

void main()
{
	fact();	
}

void fact()
{
	int no,fact=1;
	printf("Enter Number: ");
	scanf("%d",&no);

	for(int j = 1;j <= no;j++)
	{
		fact*=j;
	}
	printf("Factorial is : %d",fact);	
}	