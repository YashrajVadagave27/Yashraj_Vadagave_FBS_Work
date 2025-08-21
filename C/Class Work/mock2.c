#include<stdio.h>
#include<String.h>

void countVandC(char*);

void main()
{
	char str[] = "hello world";
	countVandC(str);
}

void countVandC(char* ptr)
{
	int i=0,c=0,v=0;
	
	while(ptr[i] != '\0')
	{
		if(ptr[i] == ' ')
		{
			i++;
			continue;
		}
		else if(ptr[i]=='a' || ptr[i]=='e' || ptr[i]=='i' || ptr[i]=='o' || ptr[i]=='u' || ptr[i]=='A' || ptr[i]=='E' || ptr[i]=='I' || ptr[i]=='O' || ptr[i]=='U')
		{
			v++;
		}
		else
		{
			c++;
		}
		i++;
	}
	printf("number of vowels in string is %d", v);
	printf("\nnumber of consonents in string is %d", c);

}