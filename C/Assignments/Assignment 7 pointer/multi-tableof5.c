#include<stdio.h>

void mul5(int* );

void main()
{
	int n = 5;
	mul5(&n);
}
void mul5(int* n)
{
	for(int j=1;j<=10;j++)
	{
		printf("%d ",*n * j);
	}
}