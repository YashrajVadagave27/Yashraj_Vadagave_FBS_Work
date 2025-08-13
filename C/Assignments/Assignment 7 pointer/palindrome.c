#include <stdio.h>

void palindrome(int*);

void main()
{
	int n;
    printf("Enter Number: ");
    scanf("%d", &n);
    
    palindrome(&n);
}
void palindrome(int* n)
{
    int sum = 0;
    int temp = *n;

    while (temp > 0)
    {
        int r = temp % 10;
        sum = sum*10 +r;
        temp /= 10;    
    }

    if (*n == sum)
    {
        printf("Palindrome");
    }
    else
    {
        printf("Not Palindrome");
    }
}

	
	


	