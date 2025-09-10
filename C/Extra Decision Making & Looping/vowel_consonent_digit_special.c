#include <stdio.h>

void main() 
{
    char ch;
    printf("Enter a Character: ");
    scanf("%c",&ch);

    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
	{
        char lower = (ch >= 'A' && ch <= 'Z') ? ch + 32 : ch;
        if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
            printf("'%c' is a Vowel\n", ch);
        else
            printf("'%c' is a Consonant\n", ch);
    }
    else if(ch >= '0' && ch <= '9') 
	{
        printf("'%c' is a Digit\n", ch);
    }
    else 
	{
        printf("'%c' is a Special Symbol\n", ch);
    }
}
