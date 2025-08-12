#include<stdio.h>

void armstrong();

void main()
{
	armstrong();
}
	
void armstrong()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	int temp=n;
	int sumF=0,sum=0;
	
	while(n>0)
	{
		int r = n%10;
		sum+=r*r*r;
		n/=10;
	}
	if(temp==sum)
	{
		printf("Armstrong");
	}
	else
	{
		printf("Not Armstrong");
	}
}