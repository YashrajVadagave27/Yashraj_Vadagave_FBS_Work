#include <stdio.h>

void main()
{
    printf("Strong or not with while\n"); 
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);

    int sum = 0;
    int temp = n;

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

    if (n == sum)
    {
        printf("Strong");
    }
    else
    {
        printf("Not Strong");
    }
    
    
    printf("\n\nStrong or not with for\n");
	int no;
	printf("Enter Number: ");
	scanf("%d",&no);
	
	int sumF=0,temp1;
	
	temp1=no;

	for(;temp1>0;temp1/=10)
	{
		int factF=1;
		int re = temp1%10;
		for (int j = 1; j <= re; j++)
		{
			factF*=j;
		}
		sumF+=factF;
	}
	if (no == sumF)
    {
        printf("Strong");
    }
    else
    {
        printf("Not Strong");
    }
}

	
	


	