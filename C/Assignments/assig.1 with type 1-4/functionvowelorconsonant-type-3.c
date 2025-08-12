#include<stdio.h>

void vowelORconsonant(char);

void main()
{
	char ch;
	printf("Enter character: ");
	scanf("%c",&ch);
	
	vowelORconsonant(ch);
}
void vowelORconsonant(char ch)
{	
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		printf("Character %c is VOWEL",ch);
	}
	else
	{
		printf("Character %c is Cosonant",ch);
	}
}