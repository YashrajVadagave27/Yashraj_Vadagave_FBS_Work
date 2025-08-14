#include<stdio.h>
void main()
{
	int n,sn,flag=0;
	printf("Enter size of array: ");
	scanf("%d",&n);
	int a[n];	
	printf("Enter elements in array A: ");
	for(int i=0; i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter the number for search: ");
	scanf("%d",&sn);
	for(int i=0;i<n;i++)
	{
		if(sn==a[i])
		{
			flag=1;
			printf("Number is found at position: %d\n",i);
			break;
		}
	}
	if(flag==0)	
	{
		printf("Number is not present in array!!");
	}	
}