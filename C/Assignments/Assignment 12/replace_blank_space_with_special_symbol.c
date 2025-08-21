#include<stdio.h>
#include<string.h>

void main()
{
	char str[200];
	printf("Enter a string: ");
    gets(str); 
	
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i] == ' ')
		{
			str[i] = '$';
		}
		i++;
	}
	
	printf("String is : %s",str);
}