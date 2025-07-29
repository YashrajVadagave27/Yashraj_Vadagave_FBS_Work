#include<stdio.h>
void main()
{
	int num = 15;
	
	if(num>0)
	{
		printf("Number %d is Positive",num);
	}
	else
	{
		if(num<0)
		{
			printf("Number %d is Negative",num);
		}
		else
		{
			printf("Number %d is Neutral",num);
		}
	}
}