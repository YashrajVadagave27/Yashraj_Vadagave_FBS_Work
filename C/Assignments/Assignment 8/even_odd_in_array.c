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
	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			printf("%d is Even Number\n",a[i]);
		}
		else
		{
			printf("%d is Odd Number\n",a[i]);			
		}
	}	
}