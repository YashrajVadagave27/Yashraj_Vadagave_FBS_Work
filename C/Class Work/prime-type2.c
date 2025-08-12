#include<stdio.h>

int prime();

void main()
{
	int re;
	if(prime()==1)
	{
		printf("Prime");
	}
	else
	{
		printf("Not Prime");
	}
}

int prime()
{
	int no,flag=1;
	printf("Enter The Number: ");
	scanf("%d",&no);
	
	for(int i=2;i<=no/2;i++)
	{
		if(no%i==0)
		{
			flag=0;
			break;
		}
	}
	return flag;	
}
