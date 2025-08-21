#include<stdio.h>
#include<string.h>

void main()
{
	int size;
	printf("enter size: ");
	scanf("%d",&size);

	char str[size];
	printf("\nenter string: ");
	scanf("%s",&str);
	
	char ch;
	printf("\nenter the character: ");
	scanf(" %c",&ch);
	
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i] == ch)
		{
			printf("%c character is found in %s string at position %d",ch,str,i);
		}
		i++;
	}
}