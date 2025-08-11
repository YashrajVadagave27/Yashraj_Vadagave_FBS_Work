#include<stdio.h>

void Power(int, int);

void main()
{
	int n,p;
	printf("enter the number : ");
	scanf("%d",&n);
	printf("enter the number : ");
	scanf("%d",&p);

	Power(n,p);
}

void Power(int n, int p)
{
	int sum=1;
	for(int i=1;i<=p;i++)
	{
		sum=sum*n;
	}
	printf("%d ^ %d = %d",n,p,sum);
}