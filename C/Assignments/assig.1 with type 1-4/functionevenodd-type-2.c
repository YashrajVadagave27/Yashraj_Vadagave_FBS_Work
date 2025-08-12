#include<stdio.h>

int evenodd();//fun_decl

void main()
{
	int res=evenodd();//fun_call
	(res==1) ? printf("number is even number") : printf("number is odd number");
}

int evenodd()//fun_def
{
	int no,flag=0; 
	printf("enter your number: ");
	scanf("%d",&no);
	
	if(no%2==0)
	{
		flag=1;
		
	}
	else
	{
		flag=0;
	}
	return flag;
}