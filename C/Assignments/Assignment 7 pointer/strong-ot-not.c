#include <stdio.h>
void strong(int*);

void main()
{
	int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    
    strong(&n);
}

void strong(int* n)
{
    int sum = 0;
    int temp = *n;

    while (temp > 0)
    {
        int r = temp % 10;
        int fact = 1;
        int i = 1;
        
        while (i <= r)
        {
            fact *= i;
            i++;
        }
        
        sum += fact;
        temp /= 10;    
    }

    if (*n == sum)
    {
        printf("Strong");
    }
    else
    {
        printf("Not Strong");
    }
}

	
	


	