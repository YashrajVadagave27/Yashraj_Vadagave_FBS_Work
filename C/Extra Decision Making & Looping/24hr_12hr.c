#include <stdio.h>

void main() 
{
    int hour, minute;

    printf("Enter time in 24-hour format (HH MM): ");
    scanf("%d %d", &hour, &minute);

    if(hour >= 0 && hour < 24 && minute >= 0 && minute < 60) 
	{
        int displayHour = hour % 12;
        if(displayHour == 0) 
			displayHour = 12;
        printf("Time in 12-hour format: %d:%d %s\n",displayHour, minute, (hour < 12) ? "AM" : "PM");
    } 
	else 
	{
        printf("Invalid time input\n");
    }
}
