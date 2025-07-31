#include<stdio.h>
void main()
{
	printf("1-10 with while\n"); 
	int i=1;
	
	while(i<=10)
	{
		printf("%d ",i);
		i++;
	}
	
	printf("\n1-10 with for\n"); 
	for(int j=1;j<=10;j++)
	{
		printf("%d ",j);
	}
}