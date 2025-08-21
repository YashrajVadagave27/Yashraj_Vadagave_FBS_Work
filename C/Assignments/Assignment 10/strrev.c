#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "Hello";

    printf("Original = %s\n", str);
    printf("Reversed = %s\n", strrev(str));

//    int i, j = strlen(str)-1;
//    char temp;
//    for(i=0; i<j; i++, j--) {
//        temp = str[i];
//        str[i] = str[j];
//        str[j] = temp;
//    }
//    printf("Reversed = %s\n", str);

}
