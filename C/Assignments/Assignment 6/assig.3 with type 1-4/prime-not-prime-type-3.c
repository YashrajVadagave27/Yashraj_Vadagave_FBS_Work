#include<stdio.h>

int prime(int);

void main()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	prime(n);
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
	if(flag==0)
	{
		printf("Prime");
	}
	else
	{
		printf("Not Prime");
	}	
}
	