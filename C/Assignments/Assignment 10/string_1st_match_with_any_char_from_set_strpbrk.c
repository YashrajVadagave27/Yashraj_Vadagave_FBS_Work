#include <stdio.h>
#include <string.h>

void main() {
    char str[] = "abcdef";
    char set[] = "xdy";
    char *p = strpbrk(str, set);
    if(p) 
		printf("First match = %c\n", *p);
    else 
		printf("No match found\n");

}
