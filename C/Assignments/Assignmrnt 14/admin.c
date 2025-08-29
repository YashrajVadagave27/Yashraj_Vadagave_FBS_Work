#include <stdio.h>
#include <string.h>

struct Admin {
    int id;
    char name[50];
    float salary, allowance;
};

void storeByValue(struct Admin a);
void displayByValue(struct Admin a);

void storeByAddress(struct Admin *a);
void displayByAddress(struct Admin *a);

int main() {
    struct Admin a1, a2, arr[2];

    storeByValue(a1);
    displayByValue(a1);

    storeByAddress(&a2);
    displayByAddress(&a2);

    for(int i=0;i<2;i++){
        printf("\nEnter details for Admin %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nDetails of Admin %d:\n", i+1);
        displayByAddress(&arr[i]);
    }
    return 0;
}

void storeByValue(struct Admin a){
    printf("Enter ID: "); scanf("%d", &a.id);
    printf("Enter Name: "); scanf("%s", a.name);
    printf("Enter Salary: "); scanf("%f", &a.salary);
    printf("Enter Allowance: "); scanf("%f", &a.allowance);
}

void displayByValue(struct Admin a){
    printf("\nID: %d", a.id);
    printf("\nName: %s", a.name);
    printf("\nSalary: %.2f", a.salary);
    printf("\nAllowance: %.2f\n", a.allowance);
}

void storeByAddress(struct Admin *a){
    printf("Enter ID: "); scanf("%d", &a->id);
    printf("Enter Name: "); scanf("%s", a->name);
    printf("Enter Salary: "); scanf("%f", &a->salary);
    printf("Enter Allowance: "); scanf("%f", &a->allowance);
}

void displayByAddress(struct Admin *a){
    printf("\nID: %d", a->id);
    printf("\nName: %s", a->name);
    printf("\nSalary: %.2f", a->salary);
    printf("\nAllowance: %.2f\n", a->allowance);
}
