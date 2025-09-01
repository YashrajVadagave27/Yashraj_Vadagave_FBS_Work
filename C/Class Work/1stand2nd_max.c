#include <stdio.h>

void main() 
{
    int n;
    printf("Enter size of the array: ");
    scanf("%d", &n);
    
    int arr[n];
    printf("Enter %d elements:\n", n);
    for(int i = 0; i < n; i++) 
	{
        scanf("%d", &arr[i]);
    }
    
    int firstMax = arr[0];
    int secondMax; 
    
    for(int i = 1; i < n; i++) 
	{
        if(arr[i] > firstMax) 
		{
            secondMax = firstMax;
            firstMax = arr[i];
        } else if(arr[i] > secondMax && arr[i] != firstMax) 
		{
            secondMax = arr[i];
        }
    }
    printf("First maximum element: %d\n", firstMax);
    printf("Second maximum element: %d\n", secondMax);
	

}
