#include <stdio.h>
int arithop();

void main() 
{
    int res = arithop();
    printf("Result is : %d",res);
}

int arithop()
{
	int a, b, result=0;
    char op;
    printf("first number: \n");
    scanf("%d",&a);
    printf("second number: \n");
    scanf("%d",&b);
    
    printf("select operator (+, -, *, /, %%)");
    scanf(" %c", &op);

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
