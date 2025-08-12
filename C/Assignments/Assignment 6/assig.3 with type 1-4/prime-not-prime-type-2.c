#include<stdio.h>

int prime();

void main()
{
	int r = prime();
	if(r==0)
	{
		printf("Prime");
	}
	else
	{
		printf("Not Prime");
	}
}
int prime()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
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
	