#include<stdio.h>
void main()
{
	int a=10, b=7;
	//post increment
	a++;
	
	printf("a : %d",a);
	
	//pre increment
	++b;
	
	printf("b : %d",b);
	
	//expressions
	
	int c=5,d;
	
	d=c++;
	printf("c : %d and d : %d",c,d);
	
	int e=4,f;
	f=++e;
	printf("e : %d and f : %d",e,f);
	
}