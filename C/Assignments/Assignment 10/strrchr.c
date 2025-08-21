#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Programming";
    char *p = strrchr(str, 'g');
    if(p) 
		printf("Last 'g' at position: %ld\n", p - str);

}
