#include<stdio.h>

void evenodd();//fun_decl

void main()
{
	evenodd();//fun_call
}

void evenodd()//fun_def
{
	int no; 
	printf("enter your number: ");
	scanf("%d",&no);
	
	if(no%2==0)
	{
		printf("%d is even number",no);
	}
	else
	{
		printf("%d is odd number",no);
	}
}