#include<stdio.h>

int reversenum(int, int);

void main()
{
	int num,r;
	printf("Enter The Number: ");
	scanf("%d",&num);
	
	printf("Original : %d\n",num);
	r = reversenum(num, 0);
	printf("Reverse : %d",r);
}

int reversenum(int n,int rev)
{
	if(n==0)
		return rev;
	return reversenum(n/10, rev*10 + (n%10));
}