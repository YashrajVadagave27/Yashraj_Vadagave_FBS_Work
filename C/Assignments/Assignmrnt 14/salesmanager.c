#include <stdio.h>
#include <string.h>

struct SalesManager {
    int id, target;
    char name[50];
    float salary, incentive;
};

void storeByValue(struct SalesManager sm);
void displayByValue(struct SalesManager sm);

void storeByAddress(struct SalesManager *sm);
void displayByAddress(struct SalesManager *sm);

int main() {
    struct SalesManager sm1, sm2, arr[2];

    storeByValue(sm1);
    displayByValue(sm1);

    storeByAddress(&sm2);
    displayByAddress(&sm2);

    for(int i=0;i<2;i++){
        printf("\nEnter details for SalesManager %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nDetails of SalesManager %d:\n", i+1);
        displayByAddress(&arr[i]);
    }
    return 0;
}

void storeByValue(struct SalesManager sm){
    printf("Enter ID: "); scanf("%d", &sm.id);
    printf("Enter Name: "); scanf("%s", sm.name);
    printf("Enter Salary: "); scanf("%f", &sm.salary);
    printf("Enter Incentive: "); scanf("%f", &sm.incentive);
    printf("Enter Target: "); scanf("%d", &sm.target);
}

void displayByValue(struct SalesManager sm){
    printf("\nID: %d", sm.id);
    printf("\nName: %s", sm.name);
    printf("\nSalary: %.2f", sm.salary);
    printf("\nIncentive: %.2f", sm.incentive);
    printf("\nTarget: %d\n", sm.target);
}

void storeByAddress(struct SalesManager *sm){
    printf("Enter ID: "); scanf("%d", &sm->id);
    printf("Enter Name: "); scanf("%s", sm->name);
    printf("Enter Salary: "); scanf("%f", &sm->salary);
    printf("Enter Incentive: "); scanf("%f", &sm->incentive);
    printf("Enter Target: "); scanf("%d", &sm->target);
}

void displayByAddress(struct SalesManager *sm){
    printf("\nID: %d", sm->id);
    printf("\nName: %s", sm->name);
    printf("\nSalary: %.2f", sm->salary);
    printf("\nIncentive: %.2f", sm->incentive);
    printf("\nTarget: %d\n", sm->target);
}
