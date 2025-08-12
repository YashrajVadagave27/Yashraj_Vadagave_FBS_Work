#include<stdio.h>
void greaterof3(int, int, int);

void main()
{
	int a, b, c;
	printf("Enter the value of a, b, c : ");
	scanf("%d%d%d",&a,&b,&c);
	
	greaterof3(a, b, c);
}
void greaterof3(int a, int b, int c)
{
	if(a>b)
	{
		if(a>c)
		{
			printf("A is greater");
		}
		else
		{
			printf("C is greater");
		}
	}
	else
	{
		if(b>c)
		{
			printf("B is greater");
		}
		else
		{
			printf("C is greater");
		}
	}
}