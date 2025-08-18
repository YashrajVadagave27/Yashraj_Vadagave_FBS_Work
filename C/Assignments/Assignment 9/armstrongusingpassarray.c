#include<stdio.h>

void armstrong(int *arr, int size);

void main()
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter numbers: ", n);
    for(int i=0; i<n; i++)
    {
    	scanf("%d", &arr[i]);	
	}

    armstrong(arr, n);
}

void armstrong(int *arr, int size)
{
    for(int i=0; i<size; i++)
    {
        int num = *(arr+i), temp=num, sum=0;
        while(temp>0)
        {
            int r = temp % 10;
            sum += r*r*r;
            temp /= 10;
        }
        if(sum == num)
            printf("%d is Armstrong\n", num);
        else
            printf("%d is Not Armstrong\n", num);
    }
}
