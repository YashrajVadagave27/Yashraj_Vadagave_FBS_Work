#include <stdio.h>

int isPrime(int num) 
{
    if (num < 2) 
		return 0;
    for (int i = 2; i <= num/2; i++)
        if (num % i == 0) 
			return 0;
    return 1;
}

void main() 
{
    int n, firstPrime = 1;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n], min, max;
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) 
		scanf("%d", &arr[i]);

    for (int i = 0; i < n; i++) 
	{
        if (isPrime(arr[i])) 
		{
            if (firstPrime) 
			{
                min = max = arr[i];
                firstPrime = 0;
            }
            if (arr[i] < min) 
				min = arr[i];
            if (arr[i] > max) 
				max = arr[i];
        }
    }

    if (firstPrime)
        printf("No prime numbers found\n");
    else 
	{
        printf("Smallest prime = %d\n", min);
        printf("Largest prime = %d\n", max);
    }
}
