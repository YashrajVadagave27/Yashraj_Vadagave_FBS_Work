#include <stdio.h>
#include <string.h>
void main() {
    char src[] = "Computer";
    char dest[20];
    strncpy(dest, src, 4);
    dest[4] = '\0';
    printf("Copied (first 4 chars) = %s\n", dest);
}
