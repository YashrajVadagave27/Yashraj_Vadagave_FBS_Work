#include <stdio.h>

void main()
{
    char str[200];
    int i = 0, count = 1;

    printf("Enter a string: ");
    gets(str);  

    while (str[i] != '\0')
    {
        if (str[i] == ' ')
            count++;
        i++;
    }

    printf("Number of words: %d\n", count);
}
