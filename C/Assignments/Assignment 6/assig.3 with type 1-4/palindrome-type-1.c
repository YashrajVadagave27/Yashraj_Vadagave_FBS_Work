#include <stdio.h>

void palindrome();

void main()
{
	palindrome();
}
void palindrome()
{
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

	
	


	