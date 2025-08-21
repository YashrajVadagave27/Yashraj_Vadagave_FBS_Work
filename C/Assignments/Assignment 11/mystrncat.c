#include <stdio.h>

char* mystrncat(char *dest, const char *src, int n)
{
    int i = 0, j = 0;

    while (dest[i] != '\0')
        i++;

    while (j < n && src[j] != '\0')
    {
        dest[i] = src[j];
        i++;
        j++;
    }
    dest[i] = '\0'; 
    return dest;
}

void main()
{
    char str1[] = "Hello";  
    char str2[] = "World";

    mystrncat(str1, str2, 3);   

    printf("Result: %s\n", str1);  

}

