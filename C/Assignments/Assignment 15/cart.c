#include <stdio.h>
#include <string.h>

struct Product 
{
    char name[50];
    float price;
    int quantity;
};

void addItems(struct Product cart[], int n) 
{
    for (int i = 0; i < n; i++) 
	{
        printf("\nEnter details for Item %d\n", i + 1);
        printf("Product Name: ");
        scanf(" %[^\n]", cart[i].name);
        printf("Price: ");
        scanf("%f", &cart[i].price);
        printf("Quantity: ");
        scanf("%d", &cart[i].quantity);
    }
}

void displayCart(struct Product cart[], int n) 
{
    float total = 0;

    printf("\n Shopping Cart \n");
    printf("Name\t\tPrice\tQuantity\tSubtotal\n");

    for (int i = 0; i < n; i++) 
	{
        float subtotal = cart[i].price * cart[i].quantity;
        printf("%s\t\t%.2f\t%d\t\t%.2f\n", 
                cart[i].name, cart[i].price, cart[i].quantity, subtotal);
        total += subtotal;
    }

    printf("\nTotal Bill: %.2f\n", total);
}

void main() 
{
    struct Product cart[20];
    int n;
	printf("How many items do you want to add? ");
    scanf("%d",&n);
    
    addItems(cart, n);
    displayCart(cart, n);
}
