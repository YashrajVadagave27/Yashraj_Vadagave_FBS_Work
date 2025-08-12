#include<stdio.h>

void fun1(int, int, int, char, double, float);
void fun2(int, char, char, double, int, float);
void fun3(int, int, char, float);

void main()
{
	int a=10,b=20,c;
	char ch='x';
	double y=10.2;
	float f=3.2;
	
	fun1(a,b,c,ch,y,f);
	fun2(a+b,'c','y',y+2,10,15+3.2);
	fun3(5*2+4,a*3,'f',20.8);
}

void fun1(int a,int b,int c, char ch, double y, float f)
{
	printf("%d - %d - %d - %c - %lf - %f",a,b,c,ch,y,f);
	printf("\n");		
}
void fun2(int a, char ch, char cha, double x, int b, float y)
{
	printf("%d - %c- %c - %lf - %d - %f",a,ch,cha,x,b,y);
	printf("\n");
}
void fun3(int a, int b, char ch, float x)
{
	printf("%d - %d- %c - %f",a,b,ch,x);
}