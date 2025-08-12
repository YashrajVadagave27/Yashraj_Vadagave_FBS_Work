#include <stdio.h>

void divisible3_5();

void main() 
{
	divisible3_5();
}

void divisible3_5()
{
	int num;
	printf("Enter a number: ");
	scanf("%d", &num);

	if(num % 3 == 0 && num % 5 == 0)
	{
		printf("Divisible by both\n");
	}
	else if(num % 3 == 0)
	{
		printf("Divisible by 3 but not by 5\n");	
	}
	else if(num % 5 == 0)
	{
		printf("Divisible by 5 but not by 3\n");	
	}
	else
	{
		printf("Divisible by None\n");	
	}
}