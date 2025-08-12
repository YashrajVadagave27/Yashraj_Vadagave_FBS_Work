#include<stdio.h>

void upperORlower(char);

void main()
{
	printf("Enter character ");
	getch();
	char ch;
	scanf("%c",&ch);
	
	upperORlower(ch);
}

void upperORlower(char ch)
{
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