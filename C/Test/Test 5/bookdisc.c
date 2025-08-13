#include <stdio.h>

float Selling(float costP, float disc);

void main() 
{
    float costP, disc, sell;

    printf("Enter cost price of book: ");
    scanf("%f", &costP);

    printf("Enter discount : ");
    scanf("%f", &disc);

    sell = Selling(costP, disc);

    printf("Selling Price : %f\n", sell);

}

float Selling(float costP, float disc) 
{
    float discAmount = (disc / 100) * costP;
    return costP - discAmount;
}
