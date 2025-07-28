#include<stdio.h>
void main()
{
	int h = 2, m = 45, s = 10, totalS;
	
	totalS = (h * 3600) + (m * 60) + s;
	
	printf("total second is %d",totalS);
}