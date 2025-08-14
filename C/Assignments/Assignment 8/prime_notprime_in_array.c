#include<stdio.h>
void main()
{
	int n;
	printf("Enter size of array: ");
	scanf("%d",&n);
	int a[n];	
	printf("Enter elements in array A: ");
	for(int i=0; i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i++)
	{
		int flag=0;
		if(a[i]<=1)
		{
			flag=1;
		}
		else
		{
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)	
		{
			printf("%d is Prime Number\n",a[i]);
		}
		else
		{
			printf("%d is Not Prime Number\n",a[i]);			
		}
	}	
}