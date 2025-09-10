#include <stdio.h>

void main() 
{
    int n;
    long term = 1;
    printf("Enter number of terms: ");
    scanf("%d", &n);
    
    printf("Series: ");
	printf("%ld, ",term);
    for(int i = 1; i <= n; i++) 
	{
        term = term+i; 
		printf("%ld",term); 
        if(i<n)
        	printf(", ");
    }
}
