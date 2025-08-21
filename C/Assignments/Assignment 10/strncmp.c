#include <stdio.h>
#include <string.h>
void main() {
    char s1[] = "application", s2[] = "apple";
    int res = strncmp(s1, s2, 5);
    if(res == 0) 
		printf("First 5 chars are equal\n");
    else 
		printf("First 5 chars are different\n");

}
