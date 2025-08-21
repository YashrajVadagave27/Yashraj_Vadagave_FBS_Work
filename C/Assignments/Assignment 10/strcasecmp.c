#include <stdio.h>
#include <string.h>

void main() {
    char s1[] = "Hello", s2[] = "hello";
    if(strcasecmp(s1, s2) == 0)
        printf("Strings are equal (ignoring upper lower case)\n");
    else
        printf("Strings are not equal\n");
}
