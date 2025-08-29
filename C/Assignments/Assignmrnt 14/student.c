#include <stdio.h>
#include <string.h>

struct Student {
    int rollNo;
    char name[50];
    float marks;
};

void storeByValue(struct Student s);
void displayByValue(struct Student s);
void storeByAddress(struct Student *s);
void displayByAddress(struct Student *s);

void main() {
    struct Student s1, s2, arr[2];


    storeByValue(s1);
    displayByValue(s1);

    storeByAddress(&s2);
    displayByAddress(&s2);

    for(int i=0;i<2;i++){
        printf("\nEnter Student %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nStudent %d Details:\n", i+1);
        displayByAddress(&arr[i]);
    }
}

void storeByValue(struct Student s)
{
    printf("Enter Roll No: "); scanf("%d", &s.rollNo);
    printf("Enter Name: "); scanf("%s", s.name);
    printf("Enter Marks: "); scanf("%f", &s.marks);
}

void displayByValue(struct Student s)
{
    printf("\nRoll: %d, Name: %s, Marks: %.2f\n", s.rollNo, s.name, s.marks);
}

void storeByAddress(struct Student *s)
{
    printf("Enter Roll No: "); scanf("%d", &s->rollNo);
    printf("Enter Name: "); scanf("%s", s->name);
    printf("Enter Marks: "); scanf("%f", &s->marks);
}

void displayByAddress(struct Student *s)
{
    printf("\nRoll: %d, Name: %s, Marks: %.2f\n", s->rollNo, s->name, s->marks);
}
