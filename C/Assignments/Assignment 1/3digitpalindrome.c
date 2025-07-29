#include<stdio.h>
void main()
{
	int number = 121, r1, r2, r3, rNum;
	
	//only for 3 digit number
	
	r1=number%10;
	number/=10;
	r2=number%10;
	r3=number/10;
	
	rNum=r1*100+r2*10+r3;
	
	if(rNum==number)
	{
		printf("Palindrome");
	}
	else
	{
		printf("Not Palindrome");
	}
	
//	int temp = number;
//	int RN=0;
//	while(temp>0)
//	{
//		int s1=temp%10;
//		RN=RN*10+s1;
//		temp/=10;
//	}
//	if(RN==number)
//	{
//		printf("Palindrome");
//	}
//	else
//	{
//		printf("Not Palindrome");
//	}	
}