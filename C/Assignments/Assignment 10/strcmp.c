#include <stdio.h>
#include <string.h>
void main() {
    char s1[] = "apple", s2[] = "banana";
    int res = strcmp(s1, s2);
    if(res == 0) 
		printf("Equal\n");
    else if(res > 0) 
		printf("s1 is greater\n");
    else 
		printf("s1 is smaller\n");

}
