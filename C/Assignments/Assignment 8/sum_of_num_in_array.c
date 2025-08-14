#include<stdio.h>
void main()
{
	int n;
	printf("Enter size of array: ");
	scanf("%d",&n);
	int a[n],sum=0;	
	printf("Enter elements in array A: ");
	for(int i=0; i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int k=0; k<n;k++)
	{
		sum+=a[k];
	}
	printf("Sum of numbers in array is: %d",sum);	
}