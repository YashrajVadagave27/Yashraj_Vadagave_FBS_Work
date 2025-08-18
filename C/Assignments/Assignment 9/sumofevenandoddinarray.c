#include <stdio.h>

void main() 
{
    int n, even = 0, odd = 0;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter elements:\n");
    for (int i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
        if (arr[i] % 2 == 0) 
		{
			even += arr[i];	
		}
        else
		{
			odd += arr[i];
		} 
    }

    printf("Sum of even = %d\n", even);
    printf("Sum of odd = %d\n", odd);
}
