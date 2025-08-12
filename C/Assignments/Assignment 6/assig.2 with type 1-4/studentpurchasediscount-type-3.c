#include <stdio.h>

void purchasebystud(int, char);

void main() 
{
	int price;
    char stud;
    printf("enter price: ");
    scanf("%d", &price);
    printf("are you a student? (y/n): ");
    scanf(" %c", &stud);
	purchasebystud(price, stud);
}
void purchasebystud(int price, char stud)
{
	int total_price;
	
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
