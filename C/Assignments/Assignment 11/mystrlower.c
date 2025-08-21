#include <stdio.h>

void mystrlower(char *str) 
{
    while (*str != '\0') 
	{
        if (*str >= 'A' && *str <= 'Z') 
		{
            *str = *str + 32;   
        }
        str++;
    }
}

int main() 
{
    char str[] = "HELLO WORLD";
    mystrlower(str);
    printf("Lowercase: %s\n", str);
    return 0;
}
