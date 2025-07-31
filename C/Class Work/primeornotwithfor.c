#include<stdio.h>
void main()
{
	int num, flag=0;
	printf("Enter Number: ");
	scanf("%d",&num);
	
	for(int i = 2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		printf("Prime");
	}
	else
	{
		printf("Not Prime");
	}
}