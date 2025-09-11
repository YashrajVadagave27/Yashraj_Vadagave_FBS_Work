#include<stdio.h>
#include<string.h>

void main()
{
	char str[200];
	
	printf("Enter the String: ");
	gets(str);
	
	int i=0,v=0,c=0,s=0,d=0;
	while(str[i] != '\0')
	{
		char ch = tolower(str[i]);
		
		if(ch >= 'a' && ch <= 'z')
		{
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				v++;
			}
			else
				c++;
		}
		else if(ch >= '0' && ch <= '9')
		{
			d++;
		}
		else if(ch == ' ')
		{
			s++;
		}
		i++;
	}
	printf("No of Vowels : %d \nNo of Consonants : %d \nNo of Spaces : %d \nNo of Digits : %d",v,c,s,d);
}