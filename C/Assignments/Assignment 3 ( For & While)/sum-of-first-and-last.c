#include <stdio.h>

void main()
{
    printf("first and last digit sum with while\n"); 
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);

    int sum,r;
    int ld = n%10;

    while (n > 0)
    {
        r = n % 10;
        n /= 10;    
    }
    sum = r + ld;
    printf("Sum of %d and %d is : %d",r,ld,sum);
    
    
    printf("\n\nfirst and last digit sum with for\n");
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int sumF = 0,re;
	int ld1 = no % 10;

	for(;no > 0;no /= 10)
	{
		re = no%10;
	}
	sumF = re + ld1;
    printf("Sum of %d and %d is : %d",re,ld1,sumF);

}

	
	


	