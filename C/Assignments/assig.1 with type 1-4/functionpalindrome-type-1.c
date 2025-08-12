#include<stdio.h>

void palindrome(); //function declaration

void main()
{
	palindrome(); //function call
}

void palindrome() //function defination
{
	int n,temp,Rnum=0;
	printf("enter the number: ");
	scanf("%d",&n);
	
	temp=n;
	
	while(temp>0)
	{
		int r=temp%10;
		Rnum=Rnum*10+r;
		temp/=10;	
	}
	if(n==Rnum)
	{
		printf("%d is palindrome number",n);
	}
	else
	{
		printf("%d is not palindrome number",n);
	}
}