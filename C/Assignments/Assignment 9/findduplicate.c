#include <stdio.h>

void main() 
{
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter elements:\n");
    for (int i = 0; i < n; i++) scanf("%d", &arr[i]);

    printf("Duplicate elements: ");
    for (int i = 0; i < n; i++)
	 {
        for (int j = i + 1; j < n; j++) 
		{
            if (arr[i] == arr[j]) 
			{
                printf("%d ", arr[i]);
                break;
            }
        }
    }
}
