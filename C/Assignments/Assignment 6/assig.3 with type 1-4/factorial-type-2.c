#include<stdio.h>

int fact();

void main()
{
	int r = fact();	
	printf("Factorial is : %d",r);
}

int fact()
{
	int no,fact=1;
	printf("Enter Number: ");
	scanf("%d",&no);

	for(int j = 1;j <= no;j++)
	{
		fact*=j;
	}
	return fact;
}	