#include <stdio.h>

int triangleType();

void main()
{
	int res = triangleType();   
	(res==0) ? printf("Equilateral Triangle\n") : (res==1) ? printf("Isosceles Triangle\n") : printf("Scalene Triangle\n");
}
int triangleType()
{
	int a, b, c,flag;
    printf("enter 3 sides of triangle\n");
    scanf("%d%d%d",&a,&b,&c);
    
    if(a == b && b == c)
    {
    	flag=0;
	}    
    else if(a == b || b == c || a == c)
    {
        flag=1;
    }	
}