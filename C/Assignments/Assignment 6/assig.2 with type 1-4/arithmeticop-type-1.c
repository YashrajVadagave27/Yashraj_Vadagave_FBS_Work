#include <stdio.h>
void arithop();

void main() 
{
	arithop();
}
void arithop()
{
	int a, b;
    char op;
    printf("first number: \n");
    scanf("%d",&a);
    printf("second number: \n");
    scanf("%d",&b);
    
    printf("select operator (+, -, *, /, %%)");
    scanf(" %c", &op);

    if(op=='+')
	{
		printf("Addition is : %d",a+b);
	}
	else if(op=='-')
	{
		printf("Substraction is : %d",a-b);
	}
	else if(op=='*')
	{
		printf("Multiplication is : %d",a*b);
	}
	else if(op=='/')
	{
		if(b!=0)
		{
			printf("Division is : %d",a/b);
		}
		else
		{
			printf("Can't divide by zero");
		}
		
	}
	else if(op=='%')
	{
		printf("Modulus is : %d",a%b);
	}
	else
	{
		printf("Default operator selected");
	}

}
