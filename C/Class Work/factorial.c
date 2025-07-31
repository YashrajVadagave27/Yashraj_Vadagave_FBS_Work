#include<stdio.h>
void main()
{
	int fact=1,n=5,i=1;
	
	while(i<=n)
	{
		fact*=i;
		i++;
	}
	printf("factorial of %d! is : %d\n",n,fact);
}