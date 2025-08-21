#include <stdio.h>
#include <string.h>
void main() {
    char src[] = "C Programming";
    char dest[50];
    strcpy(dest, src);
    printf("Copied string = %s\n", dest);

}
