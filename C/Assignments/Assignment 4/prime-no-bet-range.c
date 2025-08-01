#include<stdio.h>

void main()
{
	int n;
	printf("Enter Number for Range :");
	scanf("%d",&n);
	
	for(int i=2; i<=n; i++)
	{
		int temp=i;
		int flag=0;
		
		for(int j=2;j<=temp/2;j++)
		{
			if(temp%j==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			printf("%d is prime number\n",i);
		}
	}
}