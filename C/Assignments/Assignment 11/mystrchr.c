#include <stdio.h>

char* mystrchr(const char *str, char ch) 
{
    int i = 0;
    while (str[i] != '\0') 
    {
        if (str[i] == ch) 
        	return &str[i]; 
        i++;
    }
    return '\0'; 
}

int main() 
{
    char str[] = "Hello World";
    char *p = mystrchr(str, 'o');     

    // index position
    if (p)
        printf("Found at index: %d\n", (int)(p - str));
    else 
    	printf("Not found\n");
    return 0;
}

