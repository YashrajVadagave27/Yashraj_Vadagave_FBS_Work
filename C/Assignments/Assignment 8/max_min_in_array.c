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
	int min=a[0], max=a[0];
	for(int i=1;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}	
		if(min>a[i])
		{
			min=a[i];
		}
	}
	printf("Maximum element is: %d\n",max);	
	printf("Minimum element is: %d\n",min);	
}