#include<stdio.h>

void perfect(int *arr, int size);

void main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers: ", n);
    for(int i=0; i<n; i++)
        scanf("%d", &arr[i]);

    perfect(arr, n);
}

void perfect(int *arr, int size)
{
    for(int i=0; i<size; i++)
    {
        int num = *(arr+i), sum=0;
        for(int j=1; j<=num/2; j++)
        {
            if(num % j == 0)
                sum += j;
        }
        if(sum == num)
            printf("%d is Perfect\n", num);
        else
            printf("%d is Not Perfect\n", num);
    }
}
