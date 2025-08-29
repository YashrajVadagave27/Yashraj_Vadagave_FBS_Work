#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// 1. Find Min & Max
void findMinMax(int *arr, int n) 
{
    int min = arr[0], max = arr[0];
    for (int i = 1; i < n; i++) 
	{
        if (arr[i] < min) 
			min = arr[i];
        if (arr[i] > max) 
			max = arr[i];
    }
    printf("\nMinimum = %d, Maximum = %d\n", min, max);
}

// 2. Search number
void search(int *arr, int n, int key) 
{
    int found = 0;
    for (int i = 0; i < n; i++) 
	{
        if (arr[i] == key) 
		{
            printf("\n%d found at position %d\n", key, i);
            found = 1;
        }
    }
    if (!found) 
		printf("\n%d not found in array\n", key);
}

// 3. Sum of numbers
void findSum(int *arr, int n) 
{
    int sum = 0;
    for (int i = 0; i < n; i++) 
		sum += arr[i];
    printf("\nSum = %d\n", sum);
}

// 4. Odd and Even
void oddEven(int *arr, int n) 
{
    printf("\nEven numbers: ");
    for (int i = 0; i < n; i++) 
		if (arr[i] % 2 == 0) 
			printf("%d ", arr[i]);

    printf("\nOdd numbers: ");
    for (int i = 0; i < n; i++) 
		if (arr[i] % 2 != 0) 
			printf("%d ", arr[i]);
    printf("\n");
}

// 5. Alternate elements
void alternate(int *arr, int n) 
{
    printf("\nAlternate elements: ");
    for (int i = 0; i < n; i += 2) 
		printf("%d ", arr[i]);
    printf("\n");
}

//6. Check Prime
int isPrime(int num) 
{
    for (int i = 2; i <= num/2; i++) 
		if (num % i == 0) 
			return 0;
    return 1;

/ 6. Print only prime numbers
void printPrimes(int *arr, int n) 
{
    printf("\nPrime numbers: ");
    for (int i = 0; i < n; i++) 
		if (isPrime(arr[i])) 
			printf("%d ", arr[i]);
    printf("\n");
}

// 7. Add two arrays
void addArrays(int *a, int *b, int *c, int n) 
{
    for (int i = 0; i < n; i++) 
		c[i] = a[i] + b[i];
    printf("\nSum of arrays: ");
    for (int i = 0; i < n; i++) 
		printf("%d ", c[i]);
    printf("\n");
}

// 8. Merge two arrays
void mergeArrays(int *a, int *b, int n) 
{
    int *c = (int*)malloc(2 * n * sizeof(int));
    for (int i = 0; i < n; i++) 
		c[i] = a[i];
    for (int i = 0; i < n; i++) 
		c[n+i] = b[i];

    printf("\nMerged array: ");
    for (int i = 0; i < 2*n; i++) 
		printf("%d ", c[i]);
    printf("\n");
    free(c);
}

// 9. Reverse array
void reverseArray(int *arr, int n) 
{
    printf("\nReversed array: ");
    for (int i = n-1; i >= 0; i--) 
		printf("%d ", arr[i]);
    printf("\n");
}

// 10. Sort array (Bubble sort)
void sortArray(int *arr, int n) 
{
    for (int i = 0; i < n-1; i++) 
	{
        for (int j = 0; j < n-i-1; j++) 
		{
            if (arr[j] > arr[j+1]) 
			{
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    printf("\nSorted array: ");
    for (int i = 0; i < n; i++) 
		printf("%d ", arr[i]);
    printf("\n");
}

// Input function
void storeArray(int *arr, int n) 
{
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) 
		scanf("%d", &arr[i]);
}

void main() 
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int *arr = (int*)malloc(n * sizeof(int));
    storeArray(arr, n);

    // Perform operations
    findMinMax(arr, n);
    
    int key; 
	printf("\nEnter number to search: "); 
	scanf("%d", &key);
    search(arr, n, key);
    
    findSum(arr, n);
    
    oddEven(arr, n);
    
    alternate(arr, n);
    
    printPrimes(arr, n);

    // For two arrays
    int *brr = (int*)malloc(n * sizeof(int));
    printf("\nEnter %d elements for 2nd array: ", n);
    storeArray(brr, n);

    int *crr = (int*)malloc(n * sizeof(int));
    addArrays(arr, brr, crr, n);
    mergeArrays(arr, brr, n);

    reverseArray(arr, n);
    
    sortArray(arr, n);

    // Free memory
    free(arr);
    free(brr);
    free(crr);

}
