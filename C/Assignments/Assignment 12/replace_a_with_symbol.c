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
	
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i] == 'a' || str[i] == 'A')
		{
			str[i] = '$';
		}
		i++;
	}
	
	printf("After replacing a or A with $ string is : %s",str);
}