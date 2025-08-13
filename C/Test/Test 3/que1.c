#include <stdio.h>

void main() 
{
	int start, end, i;

	printf("Enter start: ");
	scanf("%d", &start);
	printf("Enter end: ");
	scanf("%d", &end);
	
	printf("Even: ");
	for(i=start;i<=end;i++)
	{
		if(i%2==0)
		{
			printf("%d ",i);
		}
	}
	printf("\nOdd: ");
	for(i=start;i<=end;i++)
	{
		if(i%2!=0)
		{
			printf("%d ",i);
		}
	}
}
