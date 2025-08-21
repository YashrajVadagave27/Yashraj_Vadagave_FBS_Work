#include <stdio.h>

void store(int* arr, int n)
{
    for(int i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }
}

void commonele(int* arr, int* brr, int n)
{
	for(int i=0; i<n; i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[i]==brr[j])
			{
				printf("%d ",arr[i]);
			}
		}
	}
}

void main()
{
    int s1;
    printf("Enter size: ");
    scanf("%d", &s1);

    int arr[s1],brr[s1];

    printf("Enter elements in arr: ");
    store(arr, s1);
    
    printf("Enter elements in arr: ");
    store(brr, s1);

    commonele(arr, brr, s1);

}
