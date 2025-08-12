#include <stdio.h>

int palindrome(int);

void main()
{
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int r = palindrome(no);
	(r==1) ? printf("Palindrome") : printf("Not Palindrome");
}
int palindrome(int no)
{	
	int sumF=0,temp1,flag=0;
	
	temp1=no;

	for(;temp1>0;temp1/=10)
	{
		int re = temp1%10;
		sumF=sumF*10+re;
	}

	if (no == sumF)
    {
    	flag=1;
    }
    else
    {
    	flag=0;
    }
    return flag;
}

	
	


	