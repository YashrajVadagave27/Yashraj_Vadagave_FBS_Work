#include <stdio.h>

void sumofFirstLast(int);

void main()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	sumofFirstLast(no);
}

void sumofFirstLast(int no)
{	
	int sumF = 0,re;
	int ld1 = no % 10;

	for(;no > 0;no /= 10)
	{
		re = no%10;
	}
	sumF = re + ld1;
    printf("Sum of %d and %d is : %d",re,ld1,sumF);
}

	
	


	