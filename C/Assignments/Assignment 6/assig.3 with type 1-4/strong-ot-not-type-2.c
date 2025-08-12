#include <stdio.h>

int strong();

void main()
{
	int r = strong();
	if (r==0)
    {
        printf("Strong");
    }
    else
    {
        printf("Not Strong");
    }
}

int strong()
{
    int n;
    printf("Enter Number: ");
    scanf("%d", &n);

    int sum = 0,flag;
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
    	flag=0;
    }
    else
    {
    	flag=1;
    }
    return flag;
}

	
	


	