#include<stdio.h>

void evenodd(int);//fun_decl

void main()
{
	int no; 
	printf("enter your number: ");
	scanf("%d",&no);
	
	evenodd(no);//fun_call
}

void evenodd(int no)//fun_def
{
	if(no%2==0)
	{
		printf("%d is even number",no);
	}
	else
	{
		printf("%d is odd number",no);
	}
}