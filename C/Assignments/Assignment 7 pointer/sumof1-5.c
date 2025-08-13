#include<stdio.h>
void rangesum(int*, int*);

void main()
{
	int start=1,end=5;
	rangesum(&start, &end);
}

void rangesum(int* start, int* end)
{
	int s = *start;
	int sumW=0;
	
	while(s<=*end)
	{
		sumW+=s;
		s++;
	}
	printf("%d ",sumW);
}