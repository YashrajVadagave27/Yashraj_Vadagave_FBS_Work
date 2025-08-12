#include<stdio.h>

int fact(int);

void main()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	fact(no);	
}

int fact(int no)
{
	int fact=1;

	for(int j = 1;j <= no;j++)
	{
		fact*=j;
	}
	printf("Factorial is : %d",fact);
}	