#include <stdio.h>

struct Student 
{
    int rollNo;
    char name[30];
    float marks;
};

struct Student store();
void display(struct Student);

void main() 
{
    struct Student s;
    printf("\nEnter Details Of Student 1 ");
    s = store(s);
    display(s);
}

struct Student store(struct Student s) 
{
    printf("\nEnter Student Roll No: ");
    scanf("%d", &s.rollNo);

    printf("Enter Student Name: ");
    scanf("%s", s.name);

    printf("Enter Student Marks: ");
    scanf("%f", &s.marks);

    return s;
}

void display(struct Student s) 
{
    printf("\n Student Details \n");
    printf("Roll No   : %d\n", s.rollNo);
    printf("Name      : %s\n", s.name);
    printf("Marks     : %.2f\n", s.marks);
}

