#include<stdio.h>
int perfect(int);

void main()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	perfect(no);
}
int perfect(int no)
{
	int sumF=0;
	
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
		printf("Perfect NO");	
	}
	else
	{
		printf("Not Perfect NO");
	}	
}
	