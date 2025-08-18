#include<stdio.h>

void fact(int *arr, int size);

void main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers: ", n);
    for(int i=0; i<n; i++)
        scanf("%d", &arr[i]);

    fact(arr, n);
}

void fact(int *arr, int size)
{
    for(int i=0; i<size; i++)
    {
        int num = *(arr+i), result=1;
        for(int j=1; j<=num; j++)
            result *= j;
        printf("Factorial of %d is %d\n", num, result);
    }
}
