#include<stdio.h>

int evenodd(int);//fun_decl

void main()
{
	int no;
	printf("enter your number: ");
	scanf("%d",&no);
	
	int res=evenodd(no);//fun_call
	(res==1) ? printf("number is even number") : printf("number is odd number");
}

int evenodd(int no)//fun_def
{
	int flag=0; 
	
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