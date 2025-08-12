#include<stdio.h>

void mul5();

void main()
{
	mul5();
}
void mul5()
{ 
	int i=1;
	int n=5;

	for(int j=1;j<=10;j++)
	{
		printf("%d ",n*j);
	}
}