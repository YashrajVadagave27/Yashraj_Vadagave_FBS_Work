#include<stdio.h>

void palindrome(int); //function declaration

void main()
{
	int no;
	printf("enter the number: ");
	scanf("%d",&no);
	palindrome(no); //function call
}

void palindrome(int n) //function defination
{
	int temp,Rnum=0;
	
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