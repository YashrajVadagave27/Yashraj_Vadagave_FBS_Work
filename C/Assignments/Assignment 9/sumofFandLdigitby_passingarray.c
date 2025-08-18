#include<stdio.h>

void FandLSum(int *arr, int size);

void5 main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers: ", n);
    for(int i=0; i<n; i++)
        scanf("%d", &arr[i]);

    FandLSum(arr, n);
}

void FandLSum(int *arr, int size)
{
    for(int i=0; i<size; i++)
    {
        int num = *(arr+i), ld = num%10, fd=0;
        while(num>0)
        {
            fd = num%10;
            num /= 10;
        }
        printf("Sum of first %d and last %d digit is: %d\n", fd, ld, fd+ld);
    }
}
