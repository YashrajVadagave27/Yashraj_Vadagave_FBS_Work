#include<stdio.h>
typedef struct Student {
	int rollno;
	char name[50];
	int marks;
} Student;
void main() {
	Student sjuly[5];
	Student saug[6];
	Student ssep[10];

	printf("Batch July Students\n");
	for(int i=0; i<5; i++) {
		printf("Enter the details of student %d \n",i+1);
		printf("Enter Roll no,Name,Marks\n");
		scanf(" %d ",&sjuly[i].rollno);
		scanf("%s",sjuly[i].name);
		scanf("%d",&sjuly[i].marks);
	}
	printf("\n");
	printf("Batch August Students\n");
	for(int i=0; i<6; i++) {
		printf("Enter the details of student %d \n",i+1);
		printf("Enter Roll no,Name,Marks\n");
		scanf(" %d ",&saug[i].rollno);
		scanf("%s",saug[i].name);
		scanf("%d",&saug[i].marks);
	}
	printf("\n");
	printf("Batch September Students \n");
	for(int i=0; i<10; i++) {
		printf("Enter the details of student %d \n",i+1);
		printf("Enter Roll no,Name,Marks\n");
		scanf(" %d ",&ssep[i].rollno);
		scanf("%s",ssep[i].name);
		scanf("%d",&ssep[i].marks);
	}
	printf("\n");
	printf("Batch July Students\n");
	for(int i=0; i<5; i++) {
		printf("Rollno = %d\n",sjuly[i].rollno);
		printf("Name = %s\n",sjuly[i].name);
		printf("Marks = %d\n",sjuly[i].marks);
	}
	printf("\n");
	printf("Batch August Students\n");
	for(int i=0; i<6; i++) {
		printf("Rollno = %d\n",saug[i].rollno);
		printf("Name = %s\n",saug[i].name);
		printf("Marks = %d\n",saug[i].marks);
	}
	printf("\n");
	printf("Batch September Students ");
	for(int i=0; i<10; i++) {
		printf("Rollno = %d\n",ssep[i].rollno);
		printf("Name = %s\n",ssep[i].name);
		printf("Marks = %d\n",ssep[i].marks);
	}
}