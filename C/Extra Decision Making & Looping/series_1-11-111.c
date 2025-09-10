#include <stdio.h>

void main() 
{
    int n;
    long term = 0;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Series: ");
    for(int i = 1; i <= n; i++) 
	{
        term = term * 10 + 1;  
        printf("%ld",term);
        if(i<n)
        	printf(", ");
    }
}
