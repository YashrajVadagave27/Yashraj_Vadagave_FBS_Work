#include<stdio.h>

void palindrome(int *arr, int size);

void main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers: ", n);
    for(int i=0; i<n; i++)
        scanf("%d", &arr[i]);

    palindrome(arr, n);
}

void palindrome(int *arr, int size)
{
    for(int i=0; i<size; i++)
    {
        int num = *(arr+i), temp=num, rev=0;
        while(temp>0)
        {
            int r = temp % 10;
            rev = rev*10 + r;
            temp /= 10;
        }
        if(rev == num)
            printf("%d is Palindrome\n", num);
        else
            printf("%d is Not Palindrome\n", num);
    }
}
