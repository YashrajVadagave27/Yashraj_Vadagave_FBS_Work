#include <stdio.h>
#include <string.h>

struct HR {
    int id;
    char name[50];
    float salary, commission;
};

void storeByValue(struct HR h);
void displayByValue(struct HR h);

void storeByAddress(struct HR *h);
void displayByAddress(struct HR *h);

int main() {
    struct HR h1, h2, arr[2];

    storeByValue(h1);
    displayByValue(h1);

    storeByAddress(&h2);
    displayByAddress(&h2);

    for(int i=0;i<2;i++){
        printf("\nEnter details for HR %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nDetails of HR %d:\n", i+1);
        displayByAddress(&arr[i]);
    }
    return 0;
}

void storeByValue(struct HR h){
    printf("Enter ID: "); scanf("%d", &h.id);
    printf("Enter Name: "); scanf("%s", h.name);
    printf("Enter Salary: "); scanf("%f", &h.salary);
    printf("Enter Commission: "); scanf("%f", &h.commission);
}

void displayByValue(struct HR h){
    printf("\nID: %d", h.id);
    printf("\nName: %s", h.name);
    printf("\nSalary: %.2f", h.salary);
    printf("\nCommission: %.2f\n", h.commission);
}

void storeByAddress(struct HR *h){
    printf("Enter ID: "); scanf("%d", &h->id);
    printf("Enter Name: "); scanf("%s", h->name);
    printf("Enter Salary: "); scanf("%f", &h->salary);
    printf("Enter Commission: "); scanf("%f", &h->commission);
}

void displayByAddress(struct HR *h){
    printf("\nID: %d", h->id);
    printf("\nName: %s", h->name);
    printf("\nSalary: %.2f", h->salary);
    printf("\nCommission: %.2f\n", h->commission);
}
