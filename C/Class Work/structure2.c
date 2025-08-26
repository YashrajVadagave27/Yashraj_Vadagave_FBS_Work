#include<stdio.h>
#include<string.h>
struct student
{
	int rollno;
	char name[30];
	int marks;
};

void main()
{
	struct student s1,s2;
	
	s1.rollno = 101;
	strcpy(s1.name,"Yashraj");
	s1.marks = 85;
	
	printf("Enter Details of Student 2 (Roll No, Name, Marks):");
	scanf("%d",&s2.rollno);
	scanf("%s",s2.name);
	scanf("%d",&s2.marks);
	
	printf("\nDetails of Student 1:");
	printf("\nRoll No = %d",s1.rollno);
	printf("\nName = %s",s1.name);
	printf("\nSalary = %d",s1.marks);
	
	printf("\n\nDetails of Student 2:");
	printf("\nRoll No = %d",s2.rollno);
	printf("\nName = %s",s2.name);
	printf("\nSalary = %d",s2.marks);
}