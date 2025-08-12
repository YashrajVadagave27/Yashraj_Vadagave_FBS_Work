#include<stdio.h>

void calculateTotalSalary(int);//fun_decl

void main()
{
	int basic;
	printf("enter basic salary: ");
	scanf("%d",&basic);
	calculateTotalSalary(basic);//fun_call
}

void calculateTotalSalary(int basic)//fun_def
{ 
	float da, ta, hra, tSalary;
	
	if(basic <= 5000)
	{
		da = basic*0.10;
		ta = basic*0.20;
		hra = basic*0.25;
	}
	else
	{
		da = basic*0.15;
		ta = basic*0.25;
		hra = basic*0.30;
	}
	tSalary = basic + da + ta + hra;
	printf("Total salary is : %.2f", tSalary);
}