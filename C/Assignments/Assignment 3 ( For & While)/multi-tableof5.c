#include<stdio.h>
void main()
{
	printf("multiplication table of 5 with while\n"); 
	int i=1;
	int n=5;
	
	while(i<=10)
	{
		printf("%d ",n*i);
		i++;
	}
	
	printf("\nmultiplication table of 5 with for\n"); 
	for(int j=1;j<=10;j++)
	{
		printf("%d ",n*j);
	}
}