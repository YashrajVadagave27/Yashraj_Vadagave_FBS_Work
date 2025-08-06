#include<stdio.h>
void main()
{
	int unit,totalbill;
	printf("Enter total units used: ");
	scanf("%d",&unit);
	
//	if(unit>=1 && unit<=50)
//	{
//		totalbill=unit*30;
//		printf("Total Bill for %d unit is %d",unit,totalbill);
//	}
//	else if(unit>=51 && unit<=150)
//	{
//		totalbill=unit*40;
//		printf("Total Bill for %d unit is %d",unit,totalbill);
//	}
//	else
//	{
//		totalbill=unit*50;
//		printf("Total Bill for %d unit is %d",unit,totalbill);
//	}
	
	(unit>=1&&unit<=50) ? printf("Total Bill for %d unit is %d",unit,unit*30) : (unit>=51&&unit<=150) ? printf("Total Bill for %d unit is %d",unit,unit*40) : printf("Total Bill for %d unit is %d",unit,unit*50);
}