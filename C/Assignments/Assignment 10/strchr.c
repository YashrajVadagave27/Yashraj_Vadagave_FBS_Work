#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Programming";
    char *p = strchr(str, 'g');
    if(p) 
		printf("Found at position: %ld\n", p - str);

}
