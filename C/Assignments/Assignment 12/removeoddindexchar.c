#include <stdio.h>
#include <string.h>

void main()
{
    char str[100], newStr[100];
    int i, j = 0;

    printf("Enter a string: ");
    scanf("%s", str);   

//    for (i = 0; str[i] != '\0'; i++)
//    {
//        if (i % 2 == 0)   
//        {
//            newStr[j] = str[i];
//            j++;
//        }
//    }
//    newStr[j] = '\0';   
//
//    printf("Original String: %s\n", str);
//    printf("New String     : %s\n", newStr);

	for (i = 0; str[i] != '\0'; i++)
    {
        if (i % 2 == 0)   
        {
            str[j] = str[i]; 
            j++;
        }
    }
    str[j] = '\0'; 

    printf("New String: %s\n", str);

}
