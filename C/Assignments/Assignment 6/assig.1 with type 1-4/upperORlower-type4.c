#include<stdio.h>

int upperORlower(char);

void main()
{
	getch();
	char ch;
	printf("Enter character ");
	scanf("%c",&ch);
	int res = upperORlower(ch);
	(res==0) ? printf("Uppercase Character") : (res==1) ? printf("Lowercase Character") : printf("Wrong Character Entered");
}

int upperORlower(char ch)
{
	int status;
	
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