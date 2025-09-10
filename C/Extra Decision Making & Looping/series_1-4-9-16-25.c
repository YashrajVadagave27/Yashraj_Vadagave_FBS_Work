#include <stdio.h>

void main() 
{
    int n;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Series: ");
    for(int i = 1; i <= n; i++) 
	{
        printf("%d ", i * i);  
        if(i<n)
        	printf(", ");
    }
}
