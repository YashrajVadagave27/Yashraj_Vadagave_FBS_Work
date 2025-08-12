#include <stdio.h>

void sumofFirstLast();

void main()
{
	sumofFirstLast();
}

void sumofFirstLast()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int sumF = 0,re;
	int ld1 = no % 10;

	for(;no > 0;no /= 10)
	{
		re = no%10;
	}
	sumF = re + ld1;
    printf("Sum of %d and %d is : %d",re,ld1,sumF);
}

	
	


	