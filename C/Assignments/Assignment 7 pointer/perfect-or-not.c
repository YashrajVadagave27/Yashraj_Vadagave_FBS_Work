#include<stdio.h>
void perfect(int*);

void main()
{
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	perfect(&n);
}

void perfect(int* n)
{	
	int temp=*n;
	int sum=0, i=1;
	
	while(i<=temp/2)
	{
		if(temp%i==0)
		{
			sum+=i;
		}
		i++;
	}
	if(*n==sum)
	{
		printf("Perfect No");
	}
	else
	{
		printf("Not Perfect No");
	}	
}
	