#include<stdio.h>
void main()
{
	int a[5],b[5],c[5];	
	printf("Enter elements in array A: ");
	for(int i=0; i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter elements in array B: ");
	for(int j=0; j<5;j++)
	{
		scanf("%d",&b[j]);
	}
	printf("New array will be: ");
	int s=0;
	for(int k=0; k<5;k++)
	{
		c[k]=a[k]+b[k];
		printf("%d\n",c[k]);
		s+=c[k];
	}
	printf("Total sum of elements of third array is : %d\n",s);	
}