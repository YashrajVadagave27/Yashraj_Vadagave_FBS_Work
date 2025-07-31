#include<stdio.h>
void main()
{
	printf("Armstrong or not with while\n"); 
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);
	
	int temp=n;
	int sumF=0,sum=0;
	
	while(n>0)
	{
		int r = n%10;
		sum+=r*r*r;
		n/=10;
	}
	if(temp==sum)
	{
		printf("Armstrong");
	}
	else
	{
		printf("Not Armstrong");
	}
	
	printf("\n\nArmstrong or not with for\n");
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int temp1=no;
	for(;no>0;no/=10)
	{
		int re=no%10;
		sumF+=re*re*re;
	}
	if(temp1==sumF)
	{
		printf("Armstrong");
	}
	else
	{
		printf("Not Armstrong");
	}
	
}
	