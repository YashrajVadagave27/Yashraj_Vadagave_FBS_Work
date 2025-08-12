#include<stdio.h>
int greaterof3(int, int, int);

void main()
{
	int a,b,c;
	printf("Enter the value of a, b, c : ");
	scanf("%d%d%d",&a,&b,&c);
	int result = greaterof3(a,b,c);
	printf("%d is greater!!!",result);
}
int greaterof3(int a, int b, int c)
{
	int res;
	
	if(a>b)
	{
		if(a>c)
		{
			res=a;
		}
		else
		{
			res=c;
		}
	}
	else
	{
		if(b>c)
		{
			res=b;
		}
		else
		{
			res=c;
		}
	}
	return res;
}