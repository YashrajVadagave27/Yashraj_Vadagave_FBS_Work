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
	
	int index;
	printf("\nenter index to remove: ");
	scanf("%d",&index);
	int i=index;
	
	if(index < size)
	{
		while(str[i]!='\0')
		{
			str[i]=str[i+1];
			i++;
		}
		size--;
		str[i]='\0';
	}
	else
	{
		printf("index out of range");
	}
	printf("\nAfter removing %d index string is : %s",index,str);

}