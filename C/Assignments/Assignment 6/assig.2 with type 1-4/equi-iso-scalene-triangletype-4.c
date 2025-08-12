#include <stdio.h>

int triangleType(int, int, int);

void main()
{
	int a,b,c;
	printf("enter 3 sides of triangle\n");
    scanf("%d%d%d",&a,&b,&c);
	int res = triangleType(a,b,c);   
	(res==0) ? printf("Equilateral Triangle\n") : (res==1) ? printf("Isosceles Triangle\n") : (res==2) ? printf("Scalene Triangle\n"): printf("default");
}
int triangleType(int a, int b, int c)
{
	int flag;
    
    if(a == b && b == c)
    {
    	flag=0;
	}    
    else if(a == b || b == c || a == c)
    {
        flag=1;
    }
	else
	{
		flag=2;
	}
}