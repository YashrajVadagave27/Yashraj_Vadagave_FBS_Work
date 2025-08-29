#include <stdio.h>

struct Time {
    int hour, min, sec;
};

void storeByValue(struct Time t);
void displayByValue(struct Time t);

void storeByAddress(struct Time *t);
void displayByAddress(struct Time *t);

int main() {
    struct Time t1, t2, arr[2];

    storeByValue(t1);
    displayByValue(t1);

    storeByAddress(&t2);
    displayByAddress(&t2);

    for(int i=0;i<2;i++){
        printf("\nEnter details for Time %d:\n", i+1);
        storeByAddress(&arr[i]);
    }
    for(int i=0;i<2;i++){
        printf("\nDetails of Time %d:\n", i+1);
        displayByAddress(&arr[i]);
    }
    return 0;
}

void storeByValue(struct Time t){
    printf("Enter Hour Minute Second: ");
    scanf("%d %d %d", &t.hour, &t.min, &t.sec);
}

void displayByValue(struct Time t){
    printf("Time: %02d:%02d:%02d\n", t.hour, t.min, t.sec);
}

void storeByAddress(struct Time *t){
    printf("Enter Hour Minute Second: ");
    scanf("%d %d %d", &t->hour, &t->min, &t->sec);
}

void displayByAddress(struct Time *t){
    printf("Time: %d:%d:%d\n", t->hour, t->min, t->sec);
}
