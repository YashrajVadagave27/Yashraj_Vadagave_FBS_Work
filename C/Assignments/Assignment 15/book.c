#include <stdio.h>

struct Book {
    char bname[50];
    int id;
    char author[50];
    float price;
};

void main() 
{
    struct Book b;
	
	printf("Enter Book ID: ");
    scanf("%d", &b.id);
    printf("Enter Book Name: ");
    scanf(" %[^\n]", b.bname);
    printf("Enter Author Name: ");
    scanf(" %[^\n]", b.author);
    printf("Enter Price: ");
    scanf("%f", &b.price);

    printf("\n Book Details \n");
    printf("Book ID   : %d\n", b.id);
    printf("Book Name : %s\n", b.bname);
    printf("Author    : %s\n", b.author);
    printf("Price     : %.2f\n", b.price);

}
