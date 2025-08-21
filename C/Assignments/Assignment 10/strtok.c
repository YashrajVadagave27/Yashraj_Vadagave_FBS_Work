#include <stdio.h>
#include <string.h>
void main() {
    char str[] = "C,Java,Python";
    char *token = strtok(str, ",");
    while(token) {
        printf("%s\n", token);
        token = strtok(NULL, ",");
    }
}
