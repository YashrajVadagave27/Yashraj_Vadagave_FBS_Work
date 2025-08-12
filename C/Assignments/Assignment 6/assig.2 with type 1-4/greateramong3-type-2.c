#include<stdio.h>
int greaterof3();

void main()
{
	int result = greaterof3();
	printf("%d is greater!!!",result);
}
int greaterof3()
{
	int a, b, c,res;
	printf("Enter the value of a, b, c : ");
	scanf("%d%d%d",&a,&b,&c);
	
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