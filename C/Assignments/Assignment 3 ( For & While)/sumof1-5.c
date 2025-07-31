#include<stdio.h>
void main()
{
	printf("sum of number in range 1 - 5 with while\n"); 
	int start=1;
	int end=5, sumW=0, sumF=0;
	
	while(start<=end)
	{
		sumW+=start;
		start++;
	}
	printf("%d ",sumW);
	
	printf("\n");
	
//	printf("sum of number in range 1 - 5 with for\n"); 
//	for(int j=start;j<=end;j++)
//	{
//		sumF+=j;
//	}
//	printf("%d ",sumF);
}