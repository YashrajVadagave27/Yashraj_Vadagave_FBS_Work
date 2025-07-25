#include <stdio.h>
void main() 
{
    int a = 5, b = 10, c;
    
    printf("Before Swap a = %d and b = %d\n",a,b);
    
    c = a;
    a = b;
    b = c;
    
    printf("After Swap a = %d, b = %d\n",a,b);
    
}