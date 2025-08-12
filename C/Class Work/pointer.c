#include<stdio.h>
void main()
{
	int a=10;
	int* ptr=&a;
	
	printf("a = %d\n",a);
	printf("ptr which has address of a = %u\n",ptr);
	printf("ptr address = %u\n",&ptr);
	printf("a address = %u\n",&a);
	printf("a = %d\n",*ptr);
	printf("a = %d\n",*(ptr+0));
	
	*(ptr+1)=20;
	printf("a = %d\n",*(ptr+1));
	printf("address of ptr+1 = %u\n",&ptr+1);
	printf("address of ptr+2 = %u\n",&ptr+2);

	printf("%d",sizeof(ptr));
}