#include <stdio.h>

void mystrcat(char *dest, const char *src) 
{
    while (*dest != '\0')   
        dest++;

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
    char str1[50] = "Hello ";
    char str2[] = "World";
    mystrcat(str1, str2);
    printf("Concatenated String: %s\n", str1);
    return 0;
}
