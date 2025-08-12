#include<stdio.h>

float calculateTotalSalary();//fun_decl

void main()
{
	float res=calculateTotalSalary();//fun_call
	printf("Total salary is : %.2f", res);
}

float calculateTotalSalary()//fun_def
{
	int basic; 
	float da, ta, hra, tSalary;
	printf("enter basic salary: ");
	scanf("%d",&basic);
	
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
	return tSalary;
}