#include <stdio.h>
void main() 
{
    int minutes=70;
    int hours;
    int Rminutes;

    hours = minutes / 60;

    Rminutes = minutes % 60;

    printf("%d minutes = %d hours and %d minutes\n", minutes, hours, Rminutes);

}