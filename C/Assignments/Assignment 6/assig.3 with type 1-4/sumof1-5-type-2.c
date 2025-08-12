#include<stdio.h>
int rangrsum();

void main()
{
	int r = rangesum();
	printf("%d ",r);
}

int rangesum()
{ 
	int start=1;
	int end=5, sumW=0, sumF=0;
	
	while(start<=end)
	{
		sumW+=start;
		start++;
	}
	return sumW;
}