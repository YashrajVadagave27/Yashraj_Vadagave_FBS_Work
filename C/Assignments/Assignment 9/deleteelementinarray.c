#include <stdio.h>

void main() 
{
	int n, pos;
	printf("Enter size of array: ");
	scanf("%d", &n);

	int arr[10];
	printf("Enter elements:\n");
	for (int i = 0; i < n; i++)
		scanf("%d", &arr[i]);

	printf("Enter position to delete: ", n);
	scanf("%d", &pos);

	for (int i = pos - 1; i < n - 1; i++)
		arr[i] = arr[i + 1];
	n--;

	printf("Array after deletion:\n");
	for (int i = 0; i < n; i++)
		printf("%d ", arr[i]);
}
