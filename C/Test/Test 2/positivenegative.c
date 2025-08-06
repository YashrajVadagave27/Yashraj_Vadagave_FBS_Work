#include<stdio.h>
void main()
{
	int no;
	printf("Enter the number: ");
	scanf("%d",&no);
	
//	if(no>0)
//	{
//		printf("The number %d is positive",no);
//	}
//	else if(no<0)
//	{
//		printf("The number %d is negative",no);
//	}
//	else
//	{
//		printf("The number %d is neutral(zero)",no);
//	}
	
	(no>0) ? printf("The number %d is positive",no) : (no<0) ? printf("The number %d is negative",no) : printf("The number %d is neutral(zero)",no);
}