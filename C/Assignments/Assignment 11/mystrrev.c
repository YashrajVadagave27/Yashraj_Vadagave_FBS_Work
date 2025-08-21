#include <stdio.h>

void mystrrev(char *str) 
{
    int i = 0, j = 0;
    char temp;

    while (str[j] != '\0') 
		j++;

    j--;
    while (i < j) 
	{
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
    
}

int main() 
{
    char str[] = "HELLO";
    mystrrev(str);
    printf("Reversed: %s\n", str);
    return 0;
}
