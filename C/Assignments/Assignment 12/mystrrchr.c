#include <stdio.h>

char* mystrrchr(const char *str, char ch) 
{
    int i = 0;
    char *last = NULL;

    while (str[i] != '\0') 
    {
        if (str[i] == ch) 
            last = (char*)&str[i];  
        i++;
    }
    return last; 
}

void main() 
{
    char str[] = "Hello World";
    char *p = mystrrchr(str, 'o');     

    // index position
    if (p)
        printf("Last occurrence found at index: %d\n", (int)(p - str));
    else 
        printf("Not found\n");
}
