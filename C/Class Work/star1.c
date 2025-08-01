#include<stdio.h>
void main()
{
//	printf("1. Solid Rectangle Star Pattern\n\n");
//	for(int i=1;i<=8;i++)
//	{
//		for(int j=1;j<=8;j++)
//		{
//			printf("* ");
//		}
//		printf("\n");
//	}
//	
//	printf("\n2. Hollow Rectangle Star Pattern\n\n");
//	for(int i=1;i<=8;i++)
//	{
//		for(int j=1;j<=8;j++)
//		{
//			if(i==1 || i==8 || j==1 || j==8)
//			{
//				printf("* ");
//			}
//			else
//			{
//				printf("  ");
//			}
//		}
//		printf("\n");
//	}
//	
//	printf("\n3. Hollow Rectangle with Diagonal Star Pattern\n\n");
//	for(int i=1;i<=9;i++)
//	{
//		for(int j=1;j<=9;j++)
//		{
//			if(i==1 || i==9 || j==1 || j==9 || i==j || i+j==10)
//			{
//				printf("* ");
//			}
//			else
//			{
//				printf("  ");
//			}
//		}
//		printf("\n");
//	}
//	
//	printf("\n4. Hollow Rectangle with Diagonal and center line Star Pattern\n");
//	int n1,n2;
//	printf("Enter The Number of Row and Column : ");
//	scanf("%d%d",&n1,&n2);
//	printf("\n");
//	for(int i=1;i<=n1;i++)
//	{
//		for(int j=1;j<=n2;j++)
//		{
//			if(i==1 || i==n1/2+1 || i==n1 || j==1 || j==n2/2+1 || j==n2 || i==j || i+j==n2+1)
//			{
//				printf("* ");
//			}
//			else
//			{
//				printf("  ");
//			}
//		}
//		printf("\n");
//	}
//	
//	printf("\n");
//	
//	for(int i=1;i<=n1;i++)
//	{
//		for(int j=1;j<=n2;j++)
//		{
//			if(i==1 || i==n1/2+1 || i==n1 || j==1 || j==n2/2+1 || (j==n2 && i<=n2/2+1) || i==j || i+j==n2+1)
//			{
//				printf("* ");
//			}
//			else
//			{
//				printf("  ");
//			}
//		}
//		printf("\n");
//	}
	
	printf("\n5. Triangle Star Pattern\n\n");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
	
	for(int i=5;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
		
	for(int i=1;i<=5;i++)
	{
		int j;
		for(j=i;j<5;j++)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}

	
}