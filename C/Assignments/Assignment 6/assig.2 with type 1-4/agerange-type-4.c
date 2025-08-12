#include<stdio.h>

int agerange(int);

void main()
{
	int age;
	printf("enter the age: ");
	scanf("%d",&age);
	int res = agerange(age);
	(res==0) ? printf("child") : (res==1) ? printf("teenager") : (res==2) ? printf("adult") : printf("senior");
}

int agerange(int age)
{
	int flag;
	
	if(age<12)
	{
		flag=0;
	}	
	else if(age>=12 && age<=19)
	{
		flag=1;
	}
	else if(age>=20 && age <=59)
	{
		flag=2;
	}
	else
	{
		flag=3;
	}
	return flag;
}