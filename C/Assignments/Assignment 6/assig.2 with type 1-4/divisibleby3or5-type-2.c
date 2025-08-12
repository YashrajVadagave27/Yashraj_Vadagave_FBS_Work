#include <stdio.h>

int divisible3_5();

void main() 
{
	int res = divisible3_5();
	(res==0) ? printf("Divisible by both\n") : (res==1) ? printf("Divisible by 3 only\n") : (res==2) ? printf("Divisible by 5 onlt\n") : printf("Divisible by None\n");
}

int divisible3_5()
{
	int num,flag;
	printf("Enter a number: ");
	scanf("%d", &num);
	
	if(num % 3 == 0 && num % 5 == 0)
	{
		flag=0;
	}
	else if(num % 3 == 0)
	{
		flag=1;	
	}
	else if(num % 5 == 0)
	{
		flag=2;	
	}
	return flag;
//	else
//	{
//		printf("Divisible by None\n");	
//	}
}