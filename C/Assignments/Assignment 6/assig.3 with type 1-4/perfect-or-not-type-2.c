#include<stdio.h>
int perfect();

void main()
{
	int r = perfect();
	(r==1) ? printf("Perfect No") : printf("Not Perfect NO");
}
int perfect()
{
	int sumF=0, no,flag=0;

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
		flag=1;	
	}
	else
	{
		flag=0;
	}
	return flag;
	
}
	