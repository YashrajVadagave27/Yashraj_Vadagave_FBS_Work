#include<stdio.h>
void main()
{
	int n;
	printf("Enter size of array: ");
	scanf("%d",&n);
	int a[n],b[n],c[n];	
	printf("Enter elements in array A: ");
	for(int i=0; i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter elements in array B: ");
	for(int j=0; j<n;j++)
	{
		scanf("%d",&b[j]);
	}
	printf("New array will be: ");
	for(int k=0; k<n;k++)
	{
		c[k]=a[k]+b[k];
		printf("%d\n",c[k]);
	}	
}