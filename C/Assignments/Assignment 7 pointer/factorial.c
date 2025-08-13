#include<stdio.h>

void fact(int*);

void main()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	fact(&n);
}
void fact(int* n)
{
	int fact=1;
	int i=1;
	
	while(i<=*n)
	{
		fact*=i;
		i++;
	}
	printf("Factorial is : %d",fact);	
}
	