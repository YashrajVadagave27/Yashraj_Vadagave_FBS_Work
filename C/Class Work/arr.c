#include<stdio.h>
void main()
{
	int a[10],b[5],c[7];
	
	printf("enter elements in array A: ");
	for(int i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\nenter elements in array B: ");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&b[i]);
	}
	printf("\nenter elements in array C: ");
	for(int i=0;i<7;i++)
	{
		scanf("%d",&c[i]);
	}
	
	printf("\nelements in array A: ");
	for(int j=0;j<10;j++)
	{
		printf("%d ",a[j]);
	}
	printf("\nelements in array B: ");
	for(int j=0;j<5;j++)
	{
		printf("%d ",b[j]);
	}
	printf("\nelements in array C: ");
	for(int j=0;j<7;j++)
	{
		printf("%d ",c[j]);
	}
}