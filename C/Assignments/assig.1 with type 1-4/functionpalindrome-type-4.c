#include<stdio.h>

int palindrome(int); //function declaration

void main()
{
	int n;
	printf("enter the number: ");
	scanf("%d",&n);
	int res = palindrome(n); //function call
	(res==1) ? printf("number is palindrome number") : printf("number is not palindrome number");
}

int palindrome(int n) //function defination
{
	int temp,Rnum=0,flag=0;
	
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