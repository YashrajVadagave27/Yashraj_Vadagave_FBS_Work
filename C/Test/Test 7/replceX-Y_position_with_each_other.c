#include<stdio.h>

void store(int *, int );
void display(int *, int );
void replace(int *, int, int, int);

void main()
{
	int n,s,d;
	printf("Enter Size of Array: ");
	scanf("%d",&n);
	
	int arr[n];
	
	printf("Enter The Elements in Array: ");
	store(arr,n);
	
	printf("Original Elements in Array Before Replacement: ");
	display(arr,n);
	
	printf("\nEnter 1st Position: ");
	scanf("%d",&s);
	printf("\nEnter 2nd Position: ");
	scanf("%d",&d);
	
	replace(arr,n,s,d);
		
	printf("\nElements in Array After Replacement: ");
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
	printf("\n");
}

void replace(int* arr, int n, int s, int d)
{
	for(int i=0; i<n; i++)
	{
		if(s>0 && s<n && d>0 && d<n)
		{
			int temp = arr[s];
			arr[s] = arr[d];
			arr[d] = temp;
		}
		else
			printf("Invalid Position");
	}
}