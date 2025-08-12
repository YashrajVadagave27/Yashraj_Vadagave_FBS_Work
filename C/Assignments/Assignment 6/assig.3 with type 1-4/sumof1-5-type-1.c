#include<stdio.h>
void rangrsum();

void main()
{
	rangesum();
}
void rangesum()
{ 
	int start=1;
	int end=5, sumW=0, sumF=0;
	
	while(start<=end)
	{
		sumW+=start;
		start++;
	}
	printf("%d ",sumW);
}