#include<stdio.h>
int rangrsum(int , int);

void main()
{
	int s=1,e=5;
	int r = rangesum(s,e);
	printf("%d ",r);
}

int rangesum(int s, int e)
{ 
	int sumW=0, sumF=0;
	
	while(s<=e)
	{
		sumW+=s;
		s++;
	}
	return sumW;
}