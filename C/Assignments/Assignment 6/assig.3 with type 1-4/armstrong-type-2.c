#include<stdio.h>

int armstrong();

void main()
{
	int r = armstrong();
	(r==1) ? printf("armstrong number") : printf("not armstrong number");
}
	
int armstrong()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	int temp=n;
	int flag=0,sum=0;
	
	while(n>0)
	{
		int r = n%10;
		sum+=r*r*r;
		n/=10;
	}
	if(temp==sum)
	{
		flag=1;
	}
	else
	{
		flag=0;
	}
	return flag;
}