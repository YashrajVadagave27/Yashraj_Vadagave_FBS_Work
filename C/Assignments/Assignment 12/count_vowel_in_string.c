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
	
	int i=0,count=0;
	while(str[i]!='\0')
	{
		if(str[i] == 'a' || str[i] == 'A' || str[i] == 'e' || str[i] == 'E' || str[i] == 'i' || str[i] == 'I' || str[i] == 'o' || str[i] == 'O' || str[i] == 'u' || str[i] == 'U')
		{
			count++;
		}
		i++;
	}
	printf("The Number of vowels in %s string is %d",str,count);
}