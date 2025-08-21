#include <stdio.h>
#include <string.h>
void main() {
    char str1[50] = "Hello ";
    char str2[] = "Everyone";
    strncat(str1, str2, 3);
    printf("Concatenated (first 3 chars) = %s\n", str1);

}
