#include<stdio.h>
void swap(int*, int*);

void main()
{
	int a=10,b=20;
	printf("A = %d B = %d\n",a,b);
	swap(&a,&b);
	printf("A = %d B = %d\n",a,b);
}

void swap(int* x, int* y)
{
	int temp = *x;
	*x = *y;
	*y = temp;
}