#include <stdio.h>

void mystrncpy(char *dest, const char *src, int n) 
{
    int i;
    for (i = 0; i < n && src[i] != '\0'; i++) 
	{
        dest[i] = src[i];
    }
    for (; i < n; i++) 
	{
        dest[i] = '\0';   
    }
}

int main() 
{
    char str1[] = "HelloWorld";
    char str2[20];
    mystrncpy(str2, str1, 5);
    str2[5] = '\0';  
    printf("Copied (5 chars): %s\n", str2);
    return 0;
}