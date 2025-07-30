#include <stdio.h>

void main() {
    int price, total_price;
    char stud;
    printf("enter price: ");
    scanf("%d", &price);
    printf("are you a student? (y/n): ");
    scanf(" %c", &stud);

    if(stud == 'y' || stud == 'Y') 
	{
        if(price > 500)
        {
            total_price = price - (price * 0.20);
    	}	
        else
        {
            total_price = price - (price * 0.10);
        }
    } 
	else 
	{
        if(price > 600)
        {
            total_price = price - (price * 0.15);
        }
        else
        {
            total_price = price;
        }
    }

    printf("after discount price is: %d\n", total_price);
}
