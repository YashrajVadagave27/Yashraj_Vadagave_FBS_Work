#include <stdio.h>

void mystrupper(char *str) 
{
    while (*str != '\0') 
	{
        if (*str >= 'a' && *str <= 'z') 
		{
            *str = *str - 32;   
        }
        str++;
    }
}

int main() 
{
    char str[] = "hello world";
    mystrupper(str);
    printf("Uppercase: %s\n", str);
    return 0;
}
