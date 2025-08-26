#include <stdio.h>

int isPalindrome(int*, int ); 

void main() 
{
    int n;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    
    printf("\nEnter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
	int r = isPalindrome(arr, n);
    if (r == 1) 
	{
        printf("\nThe array is a palindrome.");
    } else {
        printf("\nThe array is not a palindrome.");
    }

}

int isPalindrome(int* arr, int n) 
{
    for (int i = 0; i < n / 2; i++)
	{
        if (arr[i] != arr[n - 1 - i]) 
		{
            return 0; 
        }
    }
    return 1; 
}