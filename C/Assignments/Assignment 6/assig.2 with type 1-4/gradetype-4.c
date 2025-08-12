#include<stdio.h>
int grade(int);

void main()
{
	int marks;
	printf("enter marks of student: ");
	scanf("%d",&marks);
	int re = grade(marks);
	(re==0) ? printf("Distinction") : (re==1) ? printf("First Class") : (re==2) ? printf("Second Class") : (re==3) ? printf("Pass") : (re==4) ? printf("Fail") : printf("default range");
}
int grade(int marks)
{
	int flag;
	
	if(marks>75)
	{
		flag=0;
	}
	else if(marks>65)
	{
		flag=1;
	}
	else if(marks>55)
	{
		flag=2;
	}
	else if(marks>=40)
	{
		flag=3;
	}
	else
	{
		flag=4;
	}
	return flag;
}