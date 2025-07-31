#include<stdio.h>
void main()
{
	printf("Factorial with while\n"); 
	int n;
	printf("Enter Number: ");
	scanf("%d",&n);

	int factF=1,fact=1;
	int i=1;
	
	while(i<=n)
	{
		fact*=i;
		i++;
	}
	printf("Factorial is : %d",fact);
	
	
	printf("\n\nFactorial with for\n");
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);

	for(int j = 1;j <= no;j++)
	{
		factF*=j;
	}
	printf("Factorial is : %d",fact);
		
}
	