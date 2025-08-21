#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "HELLO";
    for(int i = 0; str[i]; i++)
	{
        str[i] = tolower(str[i]);
    }
    printf("Uppercase = %s\n", str);
	printf("Uppercase = %s\n", strlwr(str));
}