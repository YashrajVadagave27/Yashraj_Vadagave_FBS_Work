#include <stdio.h>

void main() {
    int a, b, c;
    
    printf("enter 3 sides of triangle\n");
    scanf("%d%d%d",&a,&b,&c);

    if(a == b && b == c)
    {
    	printf("Equilateral Triangle\n");
	}    
    else if(a == b || b == c || a == c)
    {
        printf("Isosceles Triangle\n");
    }
    else
    {
        printf("Scalene Triangle\n");
	}

}
