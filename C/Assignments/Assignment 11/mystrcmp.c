#include <stdio.h>

int mystrcmp(const char *str1, const char *str2) 
{
	int i=0;
    while (str1[i] != '\0' && str2[i] != '\0') 
	{
        if (str1[i] != str2[i])
            return str1[i] - str2[i];
        i++;
    }
    return str1[i] - str2[i];
}

int main() 
{
    char s1[] = "Hello";
    char s2[] = "World";
    char s3[] = "Hello";

    printf("Compare s1 & s2: %d\n", mystrcmp(s1, s2));
    printf("Compare s1 & s3: %d\n", mystrcmp(s1, s3));
    return 0;
}
