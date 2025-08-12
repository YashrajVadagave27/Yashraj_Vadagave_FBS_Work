#include<stdio.h>

int palindrome(); //function declaration

void main()
{
	int res = palindrome(); //function call
	(res==1) ? printf("number is palindrome number") : printf("number is not palindrome number");
}

int palindrome() //function defination
{
	int n,temp,Rnum=0,flag=0;
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
		flag=1;
	}
	else
	{
		flag=0;
	}
	return flag;
}