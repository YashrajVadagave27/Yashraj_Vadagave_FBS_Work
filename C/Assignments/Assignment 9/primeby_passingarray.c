#include<stdio.h>

void prime(int *arr, int size);

void main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers: ", n);
    for(int i=0; i<n; i++)
        scanf("%d", &arr[i]);

    prime(arr, n);
}

void prime(int *arr, int size)
{
    for(int i=0; i<size; i++)
    {
        int num = *(arr+i), flag=0;
        if(num <= 1) flag=1;

        for(int j=2; j<=num/2; j++)
        {
            if(num % j == 0)
            {
                flag=1; break;
            }
        }
        if(flag==0)
            printf("%d is Prime\n", num);
        else
            printf("%d is Not Prime\n", num);
    }
}
