#include <stdio.h>

struct Date 
{
    int day, month, year;
};

void storeByValue(struct Date d);
void displayByValue(struct Date d);

void storeByAddress(struct Date *d);
void displayByAddress(struct Date *d);

int main() 
{
    struct Date d1, d2, arr[2];

    storeByValue(d1);
    displayByValue(d1);

    storeByAddress(&d2);
    displayByAddress(&d2);

    for(int i=0;i<2;i++){
        printf("\nEnter details for Date %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nDetails of Date %d:\n", i+1);
        displayByAddress(&arr[i]);
    }
    return 0;
}

void storeByValue(struct Date d){
    printf("Enter Day Month Year: ");
    scanf("%d %d %d", &d.day, &d.month, &d.year);
}

void displayByValue(struct Date d){
    printf("Date: %d/%d/%d\n", d.day, d.month, d.year);
}

void storeByAddress(struct Date *d)
{
    printf("Enter Day Month Year: ");
    scanf("%d %d %d", &d->day, &d->month, &d->year);
}

void displayByAddress(struct Date *d){
    printf("Date: %d/%d/%d\n", d->day, d->month, d->year);
}
