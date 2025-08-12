#include<stdio.h>
#include<math.h>

void strong();

void main()
{
	strong();
}

void strong()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		int sum=0;
		int temp=i;
	
		for(;temp>0;temp/=10)
		{
			int fact=1;
			int re = temp%10;
			for (int j = 1; j <= re; j++)
			{
				fact*=j;
			}
			sum+=fact;
		}
		if (i == sum)
	    {
	        printf("%d is Strong Number\n",i);
	    }
	}
}