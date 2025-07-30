#include<stdio.h>

void main()
{
	int age;
	printf("enter the age: ");
	scanf("%d",&age);
	
	if(age<12)
	{
		printf("child");
	}	
	else if(age>=12 && age<=19)
	{
		printf("teenager");
	}
	else if(age>=20 && age <=59)
	{
		printf("adult");
	}
	else
	{
		printf("senior");
	}
}