#include<stdio.h>

int vowelORconsonant(char );

void main()
{
	char ch;
	printf("Enter character: ");
	scanf("%c",&ch);
	int res = vowelORconsonant(ch);
	(res==1) ? printf("Character is VOWEL") : printf("Character is VOWEL");
}
int vowelORconsonant(char ch)
{
	int flag=0;
	
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		flag=1;
	}
	else
	{
		flag=0;
	}
}