#include <stdio.h>
void FandLSum(int*);

void main()
{
	int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    
    FandLSum(&n);
}

void FandLSum(int* n)
{
    int sum,r;
    int ld = *n%10;

    while (*n > 0)
    {
        r = *n % 10;
        *n /= 10;    
    }
    sum = r + ld;
    printf("Sum of %d and %d is : %d",r,ld,sum);
}

	
	


	