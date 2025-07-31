#include<stdio.h>
void main()
{
	printf("prime or not with while\n"); 
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
	if(flag==0)
	{
		printf("Prime");
	}
	else
	{
		printf("Not Prime");
	}
	
	printf("\n\nprime or not with for\n");
	int status=0; 
	for(int j=2;j<=n/2;j++)
	{
		if(n%j==0)
		{
			status=1;
			break;
		}
	}
	if(status==0)
	{
		printf("Prime");
	}
	else
	{
		printf("Not Prime");
	}
	
}
	