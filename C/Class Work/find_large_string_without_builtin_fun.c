#include<stdio.h>
#include<string.h>

void main()
{	
//	char str[] = "hello world";
//	char ptr[] = "firstbit solutions";
	
	char str[200],ptr[200];
	printf("enter string 1: ");
	gets(str);
	printf("\nenter string 2: ");
	gets(ptr);
	
	int i=0,j=0,s=0,p=0;
	while(str[i]!='\0')
	{
		s++;
		i++;
	}
	while(ptr[j]!='\0')
	{
		p++;
		j++;
	}
	if(s == p)
		printf("both string are equal");
	else if(s>p)
		printf("string 1 is larger");
	else
		printf("string 2 is larger");	
}