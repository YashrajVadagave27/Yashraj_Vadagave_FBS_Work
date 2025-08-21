#include <stdio.h>
#include <stdlib.h>  

void storearray(int* arr, int n)
{
    printf("Enter the elements: ");
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
}

void display(int* arr, int n)
{
    printf("Array is: \n");
    for(int i = 0; i < n; i++)
    {
        printf("%d \n", arr[i]);
    }
}

int* reversearray(int* arr, int n)
{
    int* rev = (int*)malloc(n * sizeof(int));
    if(rev == NULL)
    {
        printf("Memory allocation failed!\n");
        return NULL;
    }

    for(int i = 0, j = n - 1; i < n; i++, j--)
    {
        rev[i] = arr[j];
    }
    printf("address of newly allocated reversed array = %p\n",rev);
    return rev;                         
}

void main()	
{
    int arr[10];

    storearray(arr, 10);

    printf("\nOriginal Array:\n");
    display(arr, 10);

    // rev is dynamically allocated
    int* rev = reversearray(arr, 10);

    printf("\nReversed Array:\n");
    display(rev, 10);

    printf("\nAddress of arr = %p and rev = %p\n",arr,rev);
}
