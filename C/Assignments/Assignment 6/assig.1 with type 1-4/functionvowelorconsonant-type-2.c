#include<stdio.h>

int vowelORconsonant();

void main()
{
	int res = vowelORconsonant();
	(res==1) ? printf("Character is VOWEL") : printf("Character is VOWEL");
}
int vowelORconsonant()
{
	char ch;
	int flag=0;
	printf("Enter character: ");
	scanf("%c",&ch);
	
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		flag=1;
	}
	else
	{
		flag=0;
	}
}