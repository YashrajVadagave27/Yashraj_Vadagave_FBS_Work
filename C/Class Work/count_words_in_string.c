#include <stdio.h>

void main() 
{
    char str[200];
    int i = 0, count = 0;

    printf("Enter a string: ");
    gets(str);   
    
    while (str[i] != '\0') 
	{
        if (str[i] == ' ' || str[i] == '\t' || str[i] == '\n') 
		{
            count++;
        }
        i++;
    }

    if (i > 0) 
	{
        count++;
    }

    printf("Number of words = %d\n", count);

}
