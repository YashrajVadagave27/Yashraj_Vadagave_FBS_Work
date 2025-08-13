#include<stdio.h>
void main()
{
	int a[10];	
	printf("Enter elements in array: ");
	for(int i=0; i<10;i++)
	{
		scanf("%d",&a[i]);
	}
//	printf("Elements in array are: ");
//	for(int i=0; i<10;i++)
//	{
//		printf("%d \n",a[i]);
//	}
//	printf("Maximum elements in array is: ");
//	int max=a[0];
//	for(int i=1;i<10;i++)
//	{
//		if(max<a[i])
//		{
//			max=a[i];
//		}	
//	}
//	printf("%d",max);

	int sum=0;
	printf("Sum of elements in array: ");
	for(int i=0; i<10;i++)
	{
		sum+=a[i];
	}
	printf("%d \n",sum);
	
		
}