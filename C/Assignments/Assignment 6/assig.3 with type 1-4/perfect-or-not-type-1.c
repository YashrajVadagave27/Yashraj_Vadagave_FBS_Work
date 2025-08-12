#include<stdio.h>
void perfect();

void main()
{
	perfect();
}
void perfect()
{
	int sumF=0, no;

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
	