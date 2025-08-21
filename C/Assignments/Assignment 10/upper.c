#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "hello world";
    for(int i = 0; str[i]; i++)
	{
        str[i] = toupper(str[i]);
    }
    printf("Uppercase = %s\n", str);
	printf("Uppercase = %s\n", strupr(str));
}
