#include<stdio.h>

void vowelORconsonant();

void main()
{
	vowelORconsonant();
}
void vowelORconsonant()
{
	char ch;
	printf("Enter character: ");
	scanf("%c",&ch);
	
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		printf("Character %c is VOWEL",ch);
	}
	else
	{
		printf("Character %c is Cosonant",ch);
	}
}