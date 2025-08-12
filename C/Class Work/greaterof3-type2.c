#include<stdio.h>

int greaterof3();

void main()
{
	int re;
	re=greaterof3();
	if(re==1)
	{
		printf("A is greater");
	}
	else if(re==2)
	{
		printf("B is greater");
	}
	else
	{
		printf("C is greater");
	}
}

int greaterof3()
{
	int a,b,c;
	printf("Enter The Number: ");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a>b&&a>c)
	{
		return 1;
	}
	else if(b>a&&b>c)
	{
		return 2;
	}
	else
	{
		return 3;
	}
}
