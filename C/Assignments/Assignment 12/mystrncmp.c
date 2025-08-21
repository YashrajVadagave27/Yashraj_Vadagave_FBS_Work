#include <stdio.h>

int mystrncmp(const char *str1, const char *str2, int n)
{
    int i = 0;

    while (i < n && str1[i] != '\0' && str2[i] != '\0')
    {
        if (str1[i] != str2[i])
            return (str1[i] - str2[i]);  
        i++;
    }

    // if compared n chars or both ended
    if (i == n)
        return 0;
    return (str1[i] - str2[i]);
}

void main()
{
    char s1[] = "Hello";
    char s2[] = "Helium";

    int result = mystrncmp(s1, s2, 3);   

    if (result == 0)
        printf("First 3 characters are equal\n");
    else if (result < 0)
        printf("s1 is smaller\n");
    else
        printf("s1 is greater\n");

}
