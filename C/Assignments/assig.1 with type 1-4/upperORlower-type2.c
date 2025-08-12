#include<stdio.h>

int upperORlower();

void main()
{
	int res = upperORlower();
	(res==0) ? printf("Uppercase Character") : (res==1) ? printf("Lowercase Character") : printf("Wrong Character Entered");
}

int upperORlower()
{
	getch();
	char ch;
	int status;
	printf("Enter character ");
	scanf("%c",&ch);
	
	if(ch >= 'A' && ch <= 'Z')
	{
		status=0;
	}
	else if(ch >= 'a' && ch <= 'z')
	{
		status=1;
	}
	else
	{
		status=2;
	}
	return status;
}