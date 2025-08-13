#include<stdio.h>

void armstrong(int*);

void main()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	armstrong(&no);
}

void armstrong(int* no)
{
	int sumF=0;

	int temp1=*no;
	for(;*no>0;*no/=10)
	{
		int re=*no%10;
		sumF+=re*re*re;
	}
	if(temp1==sumF)
	{
		printf("Armstrong");
	}
	else
	{
		printf("Not Armstrong");
	}
	
}
	