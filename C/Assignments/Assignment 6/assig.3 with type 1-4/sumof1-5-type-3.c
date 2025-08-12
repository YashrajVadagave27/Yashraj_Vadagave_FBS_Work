#include<stdio.h>
void rangrsum(int , int);

void main()
{
	int s=1,e=5;
	rangesum(s,e);
}

void rangesum(int s, int e)
{ 
	int sumW=0, sumF=0;
	
	while(s<=e)
	{
		sumW+=s;
		s++;
	}
	printf("%d ",sumW);
}