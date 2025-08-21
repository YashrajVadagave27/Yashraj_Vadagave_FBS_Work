#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Hello World";
    char *p = strstr(str, "World");
    if(p) 
		printf("Substring found at position: %ld\n", p - str);

}
