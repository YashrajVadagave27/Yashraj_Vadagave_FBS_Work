#include <stdio.h>

struct Book {
    int id;
    char title[50];
    float price;
};

void storeBook(struct Book *b);
void displayBook(struct Book *b);

int main() {
    struct Book b1, arr[3];

    storeBook(&b1);
    displayBook(&b1);

    for(int i=0;i<3;i++){
        printf("\nEnter details for Book %d:\n", i+1);
        storeBook(&arr[i]);
    }
    for(int i=0;i<3;i++){
        printf("\nDetails of Book %d:\n", i+1);
        displayBook(&arr[i]);
    }
    return 0;
}

void storeBook(struct Book *b){
    printf("Enter Book ID Title Price: ");
    scanf("%d %s %f", &b->id, b->title, &b->price);
}

void displayBook(struct Book *b){
    printf("Book ID: %d, Title: %s, Price: %.2f\n", b->id, b->title, b->price);
}
