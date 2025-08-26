#include <stdio.h>
#include <stdlib.h>

void main() {
    int *arr;
    int n, i;

    printf("Enter number of elements: ");
    scanf("%d", &n);

	printf("%d",arr);
    arr = (int*) calloc(n, sizeof(int));

    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    printf("Values in array after calloc (default 0): ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    
    printf("Enter %d integers:\n", n);
    for (i = 0; i < n; i++) { 
        scanf("%d", &arr[i]);   
    }

    printf("You entered: ");
    for (i = 0; i < n; i++) 
	{
        printf("%d ", arr[i]);
    }
	printf("%d",arr);
    free(arr); 
}
