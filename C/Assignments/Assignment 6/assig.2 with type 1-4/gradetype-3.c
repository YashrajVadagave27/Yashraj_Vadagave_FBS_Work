#include<stdio.h>
void grade(int );

void main()
{
	int marks;
	printf("enter marks of student: ");
	scanf("%d",&marks);
	
	grade(marks);
}
void grade(int marks)
{
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