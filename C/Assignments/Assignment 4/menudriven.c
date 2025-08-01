#include<stdio.h>
void main()
{
	int no,ch;
	printf("Enter Number: ");
	scanf("%d",&no);
	printf("\n\n");
	
	printf("__Menu__\n");
	printf("1. Even or Odd\n");
	printf("2. Prime or Not\n");
	printf("3. Palindrome or Not\n");
	printf("4. Positive Negative or Zero\n");
	printf("5. Reverse The Number\n");
	printf("6. Sum of Digit\n");
	
	printf("Enter Your Choice\n");
	scanf("%d",&ch);
	
	if(ch == 1)
	{
		if(no%2 == 0)
		{
			printf("%d is Even Number",no);
		}
		else
		{
			printf("%d is Odd Number",no);
		}	
	}
	else if(ch == 2)
	{
		int flag=0;
		for(int i = 2;i <= no/2; i++)
		{
			if(no%i == 0)
			{
				flag=1;
			}	
		}
		if(flag == 0)
		{
			printf("%d is Prime Number",no);
		}
		else
		{
			printf("%d is Not Prime Number",no);
		}
	}
	else if(ch == 3)
	{
		int temp=no;
		int Rnum=0,r;
		while(temp>0)
		{
			r=temp%10;
			Rnum=Rnum*10+r;
			temp/=10;	
		}
		if(no == Rnum)
		{
			printf("%d is Palindrome Number",no);	
		}
		else
		{
			printf("%d is Not Palindrome Number",no);
		}	
	}
	else if(ch == 4)
	{
		if(no>0)
		{
			printf("The Number %d is Positive Number",no);
		}
		else if(no<0)
		{
			printf("The Number %d is Negative Number",no);
		}
		else
		{
			printf("The Number %d is Zero",no);
		}	
	}
	else if(ch == 5)
	{
		int temp=no;
		int Rnum=0,r;
		while(temp>0)
		{
			r=temp%10;
			Rnum=Rnum*10+r;
			temp/=10;	
		}
		printf("The Reverse Number of %d is %d : ",no,Rnum);	
	}
	else if(ch == 6)
	{
		int temp=no;
		int sum=0,r;
		while(temp>0)
		{
			r=temp%10;
			sum+=r;
			temp/=10;	
		}
		printf("The Sum of Digits of Number %d is %d : ",no,sum);
	}
	else
	{
		printf("Wrong Option Selected!!\n");
	}
}