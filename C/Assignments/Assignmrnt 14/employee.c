#include <stdio.h>
#include <string.h>

struct Employee {
    int id;
    char name[50];
    float salary;
};

void storeByValue(struct Employee e);
void displayByValue(struct Employee e);

void storeByAddress(struct Employee *e);
void displayByAddress(struct Employee *e);

int main() {
    struct Employee e1, e2, arr[2];

    storeByValue(e1);
    displayByValue(e1);

    storeByAddress(&e2);
    displayByAddress(&e2);

    for(int i=0;i<2;i++){
        printf("\nEnter details for Employee %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nDetails of Employee %d:\n", i+1);
        displayByAddress(&arr[i]);
    }
    return 0;
}

void storeByValue(struct Employee e){
    printf("Enter ID: "); scanf("%d", &e.id);
    printf("Enter Name: "); scanf("%s", e.name);
    printf("Enter Salary: "); scanf("%f", &e.salary);
}

void displayByValue(struct Employee e){
    printf("\nID: %d", e.id);
    printf("\nName: %s", e.name);
    printf("\nSalary: %.2f\n", e.salary);
}

void storeByAddress(struct Employee *e){
    printf("Enter ID: "); scanf("%d", &e->id);
    printf("Enter Name: "); scanf("%s", e->name);
    printf("Enter Salary: "); scanf("%f", &e->salary);
}

void displayByAddress(struct Employee *e){
    printf("\nID: %d", e->id);
    printf("\nName: %s", e->name);
    printf("\nSalary: %.2f\n", e->salary);
}
