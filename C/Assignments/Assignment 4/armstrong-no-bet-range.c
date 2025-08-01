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
		int sum=0,r,digits=0;
		
		for(;temp>0;temp/=10)
		{
			digits++;
		}
		
		temp = i;
		for(;temp>0;temp/=10)
		{
			r=temp%10;
			int re = 1;
			for(int j=1;j<=digits;j++)
			{
				re=re*r;
			}
			sum+=re;
//			sum+=pow(r,digits);
		}
		if(i==sum)
		{
			printf("%d is armstrong number\n",i);
		}
	}
}