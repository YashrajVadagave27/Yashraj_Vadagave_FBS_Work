#include<stdio.h>

void factor(int);

void main()
{
	int a,b;
	printf("enter the range of number from start to end: ");
	scanf("%d%d",&a,&b);
	
	for(int i=a;i<=b;i++)
	{
		factor(i);
	}

}

void factor(int num)
{
	printf("%d : ",num);
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			printf("%d, ",i);
		}
	}
	printf("\n");
}