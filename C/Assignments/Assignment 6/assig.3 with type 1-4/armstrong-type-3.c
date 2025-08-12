#include<stdio.h>

int armstrong(int);

void main()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	armstrong(n);
}
	
int armstrong(int n)
{	
	int temp=n;
	int sum=0;
	
	while(n>0)
	{
		int r = n%10;
		sum+=r*r*r;
		n/=10;
	}
	if(temp==sum)
	{
		printf("armstrong number");
	}
	else
	{
		printf("not armstrong number");
	}
}