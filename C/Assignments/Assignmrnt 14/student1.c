#include <stdio.h>

struct Student {
    int roll;
    char name[30];
    float marks;
};

void storeByValue(struct Student s);
void displayByValue(struct Student s);

void storeByAddress(struct Student *s);
void displayByAddress(struct Student *s);

int main() {
    struct Student s1, s2, arr[2];

    storeByValue(s1);
    displayByValue(s1);

    storeByAddress(&s2);
    displayByAddress(&s2);

    for(int i=0;i<2;i++){
        printf("\nEnter details for Student %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nDetails of Student %d:\n", i+1);
        displayByAddress(&arr[i]);
    }
    return 0;
}

void storeByValue(struct Student s){
    printf("Enter Roll Name Marks: ");
    scanf("%d %s %f", &s.roll, s.name, &s.marks);
}

void displayByValue(struct Student s){
    printf("Roll: %d, Name: %s, Marks: %.2f\n", s.roll, s.name, s.marks);
}

void storeByAddress(struct Student *s){
    printf("Enter Roll Name Marks: ");
    scanf("%d %s %f", &s->roll, s->name, &s->marks);
}

void displayByAddress(struct Student *s){
    printf("Roll: %d, Name: %s, Marks: %.2f\n", s->roll, s->name, s->marks);
}
