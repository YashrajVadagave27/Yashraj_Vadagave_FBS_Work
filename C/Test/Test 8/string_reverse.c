#include <stdio.h>
#include <string.h>

void reverseString(char str[] );

void main() 
{
    char str[100];

    printf("Enter a string: ");
    scanf("%s", str);

    reverseString(str);
    printf("Reversed string: %s\n", str);
}

void reverseString(char str[]) 
{
    int i, len, temp;
    len = strlen(str);

    for(i = 0; i < len / 2; i++) 
	{
        temp = str[i];
        str[i] = str[len - i - 1];
        str[len - i - 1] = temp;
    }
}