#include<stdio.h>
void main()
{
	float basic = 7000.00, da, ta, hra, tSalary;
	
	if(basic <= 5000)
	{
		da = basic*0.10;
		ta = basic*0.20;
		hra = basic*0.25;
		
		tSalary = basic + da + ta + hra;
		printf("Total salary is : %.2f", tSalary);
	}
	else
	{
		da = basic*0.15;
		ta = basic*0.25;
		hra = basic*0.30;
		
		tSalary = basic + da + ta + hra;
		printf("Total salary is : %.2f", tSalary);
	}
}