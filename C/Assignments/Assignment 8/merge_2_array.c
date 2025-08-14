#include <stdio.h>

void main() 
{
    int n1, n2;

    printf("Enter size of first array: ");
    scanf("%d", &n1);
    printf("\nEnter size of second array: ");
    scanf("%d", &n2);
    
    int a[n1],b[n2];
    printf("\nEnter elements of first array: ");
    for (int i = 0; i < n1; i++) 
	{
        scanf("%d", &a[i]);
    }
    printf("\nEnter elements of second array: ");
    for (int i = 0; i < n2; i++) 
	{
        scanf("%d", &b[i]);
    }

    int c[n1 + n2];
    for (int i = 0; i < n1; i++) 
	{
        c[i] = a[i];
    }
    for (int i = 0; i < n2; i++) 
	{
        c[n1 + i] = b[i];
    }

    printf("\nMerged array: ");
    for (int i = 0; i < n1 + n2; i++) 
	{
        printf("%d ", c[i]);
    }
}
