#include <stdio.h>
#include <string.h>

struct Product 
{
	int id;
    char name[50];
    float price;
    float discp;
    float fprice;
};

void main() 
{
    int n;
	printf("Enter The Number of Product: ");
    scanf("%d",&n);
    
    struct Product p[n];
    
    for (int i = 0; i < n; i++) 
	{
        printf("\nEnter details for Item %d\n", i + 1);
        printf("Product ID: ");
        scanf("%d",&p[i].id);
        printf("Product Name: ");
        scanf("%s", p[i].name);
        printf("Price: ");
        scanf("%f", &p[i].price);
        
        if(p[i].price > 500)
        {
        	p[i].discp = p[i].price*0.80;
		}
		else
		{
			p[i].discp = p[i].price*0.95;
		}
		
		p[i].fprice = p[i].discp*0.82;
    }
    
    printf("Product Details Are: \n");
    printf("ID\tName\tPrice\tDiscPrice\tFinal Price\n");
    for(int i=0; i<n; i++)
    {
    	printf("%d\t%s\t%.2f\t%.2f\t\t%.2f\n",p[i].id,p[i].name,p[i].price,p[i].discp,p[i].fprice);	
	}
}
