#include<stdio.h>
void main()
{
	int n,a,b,c,res;
	printf("Enter number: ");
	scanf("%d",&n);
	(n%2==0) ? printf("even") : printf("odd");
	
	printf("enter a, b, c: ");
	scanf("%d%d%d",&a,&b,&c);
	
	res = a>b ? a>c ? a : c : b>c ? b : c; 
	printf("%d is greater",res);
}