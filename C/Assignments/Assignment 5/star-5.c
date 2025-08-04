#include<stdio.h>
void main()
{
	for (int i = 5; i > 0; i--) 
	{

	    for (int j = 0; j < 5 - i; j++) 
		{
	        printf(" ");
	    }

	    for (int k = 0; k < i; k++) 
		{
	        printf("* ");
	    }
    	printf("\n");
	}
}

 