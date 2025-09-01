#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

void main() 
{
    char userid[20], password[20];
    char valid_userid[] = "admin";
    char valid_password[] = "1234";

    printf("Enter User ID: ");
    scanf("%s", userid);

    printf("Enter Password: ");
    scanf("%s", password);

    if(strcmp(userid, valid_userid) == 0 && strcmp(password, valid_password) == 0) 
	{
        srand(time(0));
        int random_number = rand() % 9000 + 1000;
        printf("Verification Code: %d\n", random_number);

        int entered_number;
        printf("Enter the verification Code Correctly as Above: ");
        scanf("%d", &entered_number);

        if(entered_number == random_number) 
		{
            printf("Success\n");
        } 
		else 
		{
            printf("Failed\n");
        }
    } 
	else 
	{
        printf("Invalid User ID or Password\\n");
    }

}
