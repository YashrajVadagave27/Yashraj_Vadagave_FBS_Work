#include<stdio.h>

void strong(int *arr, int size);

void main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers: ", n);
    for(int i=0; i<n; i++)
        scanf("%d", &arr[i]);

    strong(arr, n);
}

void strong(int *arr, int size)
{
    for(int i=0; i<size; i++)
    {
        int num = *(arr+i), temp=num, sum=0;
        while(temp>0)
        {
            int r = temp % 10, fact=1;
            for(int j=1; j<=r; j++)
                fact *= j;
            sum += fact;
            temp /= 10;
        }
        if(sum == num)
            printf("%d is Strong\n", num);
        else
            printf("%d is Not Strong\n", num);
    }
}
