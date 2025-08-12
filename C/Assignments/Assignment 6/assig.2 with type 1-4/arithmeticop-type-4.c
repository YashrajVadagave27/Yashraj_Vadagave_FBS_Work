#include <stdio.h>
int arithop(int , int , char);

void main() 
{
	int a,b;
	char op;
	printf("first number: \n");
    scanf("%d",&a);
    printf("second number: \n");
    scanf("%d",&b);
    
    printf("select operator (+, -, *, /, %%)");
    scanf(" %c", &op);
    int res = arithop(a,b,op);
    printf("Result is : %d",res);
}

int arithop(int a, int b, char op)
{
	int result=0;

    if(op=='+')
	{
		result=a+b;
	}
	else if(op=='-')
	{
		result=a-b;
	}
	else if(op=='*')
	{
		result=a*b;
	}
	else if(op=='/')
	{
		if(b!=0)
		{
			result=a/b;
		}
		else
		{
			result=0;
		}
		
	}
	else if(op=='%')
	{
		result=a%b;
	}
	else
	{
		printf("Default operator selected");
	}
	return result;
}
