#include <stdio.h>

void main() 
{
    int n,j;
    printf("Enter size of array: ");
    scanf("%d",&n);

    int a[n], b[n];
    printf("Enter elements of array: ");
    for (int i = 0; i < n; i++) 
	{
        scanf("%d",&a[i]);
    }
	
	printf("Original array: ");
	for (int i = 0; i < n; i++) 
	{
        printf("%d ",a[i]);
    }
   	for (int i = 0; i < n; i++)
	{
       b[i] = a[n - 1 - i];
   	}
   	printf("\nReversed array: ");
   	for (int i = 0; i < n; i++) 
	{
       printf("%d ", b[i]);
   	}

//	for (int i = 0, j = n - 1; i < j; i++, j--) 
//	{
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//    printf("\nReversed array: ");
//    for (int i = 0; i < n; i++) 
//	{
//        printf("%d ", a[i]);
//    }

}
