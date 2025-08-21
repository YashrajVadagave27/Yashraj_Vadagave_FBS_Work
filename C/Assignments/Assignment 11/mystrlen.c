#include <stdio.h>

int mystrlen(const char *str) 
{
    int len = 0;
    while (str[len] != '\0') 
	{
        len++;
    }
    return len;
}

int main() 
{
    char str[] = "Hello";
    printf("Length of string: %d\n", mystrlen(str));
    return 0;
}
