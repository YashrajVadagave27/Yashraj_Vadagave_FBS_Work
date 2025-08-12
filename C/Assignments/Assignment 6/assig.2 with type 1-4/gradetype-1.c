#include<stdio.h>
void grade();

void main()
{
	grade();
}
void grade()
{
	int marks;
	printf("enter marks of student: ");
	scanf("%d",&marks);
	
	if(marks>75)
	{
		printf("Distinction");
	}
	else if(marks>65)
	{
		printf("First Class");
	}
	else if(marks>55)
	{
		printf("Second Class");
	}
	else if(marks>=40)
	{
		printf("Pass");
	}
	else
	{
		printf("Fail");	
	}
}