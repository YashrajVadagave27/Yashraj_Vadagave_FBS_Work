#include<stdio.h>

int prime(int);

void main()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	int r = prime(n);
	if(r==0)
	{
		printf("Prime");
	}
	else
	{
		printf("Not Prime");
	}
}
int prime(int n)
{
	int i=2,flag=0;
	
	while(i<=n/2)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
		i++;
	}
	return flag;	
}
	