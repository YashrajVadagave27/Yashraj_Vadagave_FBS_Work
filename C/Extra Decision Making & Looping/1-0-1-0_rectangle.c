#include <stdio.h>

void main() 
{
    for(int i = 1; i <= 3; i++) 
	{
		for(int j = 1; j <= 5; j++)
		{
			if(j%2 != 0)
				printf("1 "); 
			else
				printf("0 ");
		}
		printf("\n\n");
    }
}
