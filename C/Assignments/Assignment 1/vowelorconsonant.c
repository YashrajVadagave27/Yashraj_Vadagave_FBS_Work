#include<stdio.h>
void main()
{
	char ch = 'Z';
	
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		printf("Character %c is VOWEL",ch);
	}
	else
	{
		printf("Character %c is Cosonant",ch);
	}
}