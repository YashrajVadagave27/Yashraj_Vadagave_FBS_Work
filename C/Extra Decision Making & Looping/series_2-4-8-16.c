#include <stdio.h>

void main() 
{
    int n;
    long term = 2;
    printf("Enter number of terms: ");
    scanf("%d", &n);
    
    printf("Series: ");
	printf("%ld, ",term);
    for(int i = 1; i <= n; i++) 
	{
        term = term*2; 
		printf("%ld",term); 
        if(i<n)
        	printf(", ");
    }
}
