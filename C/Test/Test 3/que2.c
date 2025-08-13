#include <stdio.h>

void main() 
{
    int start, end, sum = 0, i;

    printf("Enter start: ");
    scanf("%d", &start);
    printf("Enter end: ");
    scanf("%d", &end);

    for (i = start; i <= end; i += 2) 
	{
        sum += i;
    }

    printf("sum = %d\n", sum);
}
