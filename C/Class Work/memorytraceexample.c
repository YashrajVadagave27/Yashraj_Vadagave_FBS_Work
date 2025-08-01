#include<stdio.h>
void main()
{
	int a=5, b=7, x;
	for(int i=2;i<5;i++)
	{
		x=a+b;
		for(int j=1;j<=i;j++)
		{
			a=a+i;
			b=b+j;
		}
	}
	printf("a = %d, b = %d, x = %d",a,b,x);
}