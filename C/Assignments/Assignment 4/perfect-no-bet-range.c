#include<stdio.h>
#include<math.h>
void main()
{
	int n;
	printf("Enter Number for Range :");
	scanf("%d",&n);
	
	for(int i=1; i<=n; i++)
	{
		int temp=i;
		int sum=0;
		
		for(int j=1;j<temp;j++)
		{
			if(temp%j==0)
			{
				sum+=j;
			}
		}		
		if(sum==i)
		{
			printf("%d is perfect number\n",i);
		}
	}
}