#include<stdio.h>
void main()
{
	printf("Perfect or not with while\n"); 
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	int temp=n;
	int sumF=0,sum=0;
	int i=1;
	
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum+=i;
		}
		i++;
	}
	if(temp==sum)
	{
		printf("Perfect No");
	}
	else
	{
		printf("Not Perfect No");
	}
	
	printf("\n\nPerfect or not with for\n");
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int temp1=no;
	for(int j = 1;j <= no/2;j++)
	{
		if(no%j==0)
		{
			sumF+=j;
		}	
	}
	if(temp1==sumF)
	{
		printf("Perfect No");
	}
	else
	{
		printf("Not Perfect NO");
	}
	
}
	