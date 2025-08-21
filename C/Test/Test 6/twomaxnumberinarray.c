#include <stdio.h>

void store(int* arr, int n)
{
    for(int i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }
}

void twomaxnumber(int* arr, int n)
{
    // sort in ascending order
    for(int i=0; i<n-1; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            if(arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    printf("First Max = %d\n", arr[n-1]);
    printf("Second Max = %d\n", arr[n-2]);
}

int main()
{
    int s1;
    printf("Enter size: ");
    scanf("%d", &s1);

    int arr[s1];

    printf("Enter elements in arr: ");
    store(arr, s1);

    twomaxnumber(arr, s1);

    return 0;
}
