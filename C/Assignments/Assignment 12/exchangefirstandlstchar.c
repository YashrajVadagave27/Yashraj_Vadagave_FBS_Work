#include <stdio.h>
#include <string.h>

void main() 
{
    char str[100], newStr[100];
    int len;

    printf("Enter a string: ");
    scanf("%s", str);   

    len = strlen(str);

    strcpy(newStr, str);

    if (len > 1)  
    {
        newStr[0] = str[len - 1];
        newStr[len - 1] = str[0];
    }

    printf("Original String: %s\n", str);
    printf("New String     : %s", newStr);

}
