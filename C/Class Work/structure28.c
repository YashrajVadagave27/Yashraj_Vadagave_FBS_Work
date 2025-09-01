#include<stdio.h>
typedef struct Student {
	int rollno;
	char name[50];
	int marks;
} Student;

void main() {
	int n;
	printf("Enter number of students: ");
	scanf("%d",&n);
	
	Student stu[n];

	for(int i=0; i<n; i++) {
		printf("\nEnter the details of student %d \n",i+1);
		printf("\nEnter Roll no,Name,Marks\n");
		scanf(" %d ",&stu[i].rollno);
		scanf("%s",stu[i].name);
		scanf("%d",&stu[i].marks);
	}
	for(int i=0; i<n;i++) {
		printf("\nRollno = %d\n",stu[i].rollno);
		printf("Name = %s\n",stu[i].name);
		printf("Marks = %d\n",stu[i].marks);
	}

	int Roll_no;
	printf("\nEnter the Roll no you want to search\n");
	scanf("%d",&Roll_no);
	int index = -1;

	for(int i=0; i<n;i++) {
		if(stu[i].rollno==Roll_no) {
			 index=i;
			break;
		}
	}
	if(index!=-1)
		printf("Roll no %d is found at index %d\n",stu[index].rollno,index);
	else
		printf("Roll no is not found");
}