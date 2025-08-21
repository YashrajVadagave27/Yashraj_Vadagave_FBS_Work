#include <stdio.h>

void mystrcpy(char *dest, const char *src) 
{
    while (*src != '\0') 
	{
        *dest = *src;
        dest++;
        src++;
    }
    *dest = '\0';   
}

int main() 
{
    char str1[50] = "Hello World";
    char str2[50];
    mystrcpy(str2, str1);
    printf("Copied String: %s\n", str2);
    return 0;
}
