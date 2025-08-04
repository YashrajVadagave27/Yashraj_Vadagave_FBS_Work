#include<stdio.h>
void main()
{
	for(int i=5;i>0;i--)
	{
		for(int j=1;j<=i-1;j++)
		{
			printf(" ");
		}
		for(int k=5;k>=i;k--)
		{
			printf("* ");
		}
		printf("\n");
	}
}