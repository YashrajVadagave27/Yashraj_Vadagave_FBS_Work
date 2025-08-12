#include<stdio.h>
void greaterof3();

void main()
{
	greaterof3();
}
void greaterof3()
{
	int a, b, c;
	printf("Enter the value of a, b, c : ");
	scanf("%d%d%d",&a,&b,&c);
	
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