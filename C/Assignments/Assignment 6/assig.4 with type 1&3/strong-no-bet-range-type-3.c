#include<stdio.h>
#include<math.h>

void strong(int);

void main()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	strong(n);
}

void strong(int n)
{
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