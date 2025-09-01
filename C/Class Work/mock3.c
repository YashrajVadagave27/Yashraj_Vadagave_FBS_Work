//element<50 & element>65 
#include<stdio.h>
void store(int*,int);
void display(int*,int);
void replace(int*,int);
void main()
{
	int n;
	printf("enter size of array: ");
	scanf("%d",&n);
	
	int arr[n];
	store(arr,n);
	printf("\nOriginal array: ");
	display(arr,n);
	
	replace(arr,n);
	
	printf("\nNew array: ");
	display(arr,n);
}
void store(int* arr, int n)
{
	for(int i=0; i<n; i++)
	{
		scanf("%d",&arr[i]);
	}
}
void display(int* arr, int n)
{
	for(int i=0; i<n; i++)
	{
		printf("%d ",arr[i]);
	}
}
void replace(int* arr, int n)
{
	for(int i=0; i<n; i++)
	{
		if(arr[i]<50 || arr[i]>65)
			arr[i]=0;
	}
}