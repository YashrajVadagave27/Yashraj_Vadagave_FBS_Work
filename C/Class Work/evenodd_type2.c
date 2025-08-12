#include<stdio.h>

int evenodd();

void main()
{
	int re;
	re=evenodd();
	if(re==1)
	{
		printf("Even");
	}
	else
	{
		printf("Odd");
	}
}

int evenodd()
{
	int no;
	printf("Enter The Number: ");
	scanf("%d",&no);
	
	return no%2==0;
}
