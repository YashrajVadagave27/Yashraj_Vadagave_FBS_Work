#include<stdio.h>
void main()
{
	int n;
	printf("Enter size of array: ");
	scanf("%d",&n);
	int a[n];	
	printf("Enter elements in array A: ");
	for(int i=0; i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i+=2)
	{
		printf("%d ",a[i]);
	}	
}