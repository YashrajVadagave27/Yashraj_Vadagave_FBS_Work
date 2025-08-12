#include<stdio.h>

void upperORlower();

void main()
{
	upperORlower();
}

void upperORlower()
{
	getch();
	char ch;
	printf("Enter character ");
	scanf("%c",&ch);
	
	if(ch >= 'A' && ch <= 'Z')
	{
		printf("Character %c is in Upper Case",ch);
	}
	else if(ch >= 'a' && ch <= 'z')
	{
		printf("Character %c is in Lower Case",ch);
	}
	else
	{
		printf("Character is not Alphabet");
	}
}