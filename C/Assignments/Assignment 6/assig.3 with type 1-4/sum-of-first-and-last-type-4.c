#include <stdio.h>

int sumofFirstLast(int);

void main()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int r = sumofFirstLast(no);
	printf("Sum is : %d",r);
}

int sumofFirstLast(int no)
{	
	int sumF = 0,re;
	int ld1 = no % 10;

	for(;no > 0;no /= 10)
	{
		re = no%10;
	}
	return re + ld1;
    
}

	
	


	