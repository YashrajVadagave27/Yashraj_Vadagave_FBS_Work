#include <stdio.h>

void main()
{
    printf("Palindrome with while\n"); 
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);

    int sum = 0;
    int temp = n;

    while (temp > 0)
    {
        int r = temp % 10;
        sum = sum*10 +r;
        temp /= 10;    
    }

    if (n == sum)
    {
        printf("Palindrome");
    }
    else
    {
        printf("Not Palindrome");
    }
    
    
    printf("\n\nStrong or not with for\n");
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int sumF=0,temp1;
	
	temp1=no;

	for(;temp1>0;temp1/=10)
	{
		int re = temp1%10;
		sumF=sumF*10+re;
	}

	if (no == sumF)
    {
        printf("Palindrome");
    }
    else
    {
        printf("Not Palindrome");
    }
}

	
	


	