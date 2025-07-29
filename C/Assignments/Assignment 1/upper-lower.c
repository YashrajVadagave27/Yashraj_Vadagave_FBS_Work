#include<stdio.h>
void main()
{
	char ch = 'z';
	
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