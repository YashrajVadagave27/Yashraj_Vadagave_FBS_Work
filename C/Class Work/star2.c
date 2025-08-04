#include<stdio.h>
void main()
{
//	    *
//	   **
//	  ***
//	 **** 
//	*****
//	for(int i=5;i>0;i--)
//	{
//		for(int j=1;j<=i-1;j++)
//		{
//			printf(" ");
//		}
//		for(int k=5;k>=i;k--)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}


//	****
//	***
//	**
//	*
//	**
//	***
//	****
//	for(int i=4;i>0;i--)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			printf("*");
//		} 
//		printf("\n");
//	}
//	for(int p=2;p<=4;p++)
//	{
//		for(int q=1;q<=p;q++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//
////	1
////	2 3
////	4 5 6
////	7 8 9 10
////	11 12 13 14 15
//	
//	int k=1;
//	for(int i=0;i<5;i++)
//	{
//		for(int j=0;j<=i;j++)
//		{
//			printf("%d ",k);
//			k++;
//		}
//		printf("\n");
//	}
//
//	1
//	1 2
//	1 2 3 
//	1 2 3 4
//	1 2 3 4 5
//	for(int i=0;i<5;i++)
//	{
//		for(int j=0;j<=i;j++)
//		{
//			printf("%d ",j+1);
//		}
//		printf("\n");
//	}
//
////	*
////	##
////	***
////	####
////	*****
//
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			if(i%2!=0)
//			{
//				printf("*");
//			}
//			else
//			{
//				printf("#");
//			}
//		}
//		printf("\n");
//	}
//
////	1+11+111+1111
//	int k=1;
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			printf("%d",k);
//		}
//		if(i<4)
//		{
//			printf("+");
//		}
//	}
//
////	1+12+123+1234+12345
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			printf("%d",j);
//		}
//		if(i<5)
//		{
//			printf("+");
//		}
//	}
//			 2
//		   4 2
//	     6 4 2
//	   8 6 4 2
//	10 8 6 4 2
//	
	int p=2,l;
	for(int i=1;i<=5;i++)
	{
		for(int k=5;k>=i;k--)
		{
			printf("  ");
		}
		l=p;
		for(int j=1;j<=i;j++)
		{
			printf("%d ",l);
			l-=2;
		}
		p+=2;
		printf("\n");
	}

}