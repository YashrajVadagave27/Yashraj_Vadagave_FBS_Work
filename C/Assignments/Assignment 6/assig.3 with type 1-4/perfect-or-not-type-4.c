#include<stdio.h>
int perfect(int);

void main()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int r = perfect(no);
	(r==1) ? printf("Perfect No") : printf("Not Perfect NO");
}
int perfect(int no)
{
	int sumF=0,flag=0;
	
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
	