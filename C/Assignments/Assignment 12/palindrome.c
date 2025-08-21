#include <stdio.h>
#include <string.h>

int Palindrome(char *str)
{
    int i = 0, j = strlen(str) - 1;

    while (i < j)
    {
        if (str[i] != str[j])
            return 0; 
        i++;
        j--;
    }
    return 1; 
}

void main()
{
    char str[] = "nayanraj";   
    if (Palindrome(str))
        printf("palindrome");
    else
        printf("not palindrome");
}
