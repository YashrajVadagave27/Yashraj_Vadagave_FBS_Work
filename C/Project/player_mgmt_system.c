#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Player 
{
    int jerseyNo;
    char name[50];
    int runs;
    int wickets;
    int matches;
};

void storePlayers(struct Player **players, int *count);
void displayAll(struct Player *players, int count);
void searchPlayer(struct Player *players, int count);
void addPlayer(struct Player **players, int *count);
void removePlayer(struct Player **players, int *count);
void updatePlayer(struct Player *players, int count);
void displaySortedPlayers(struct Player *players, int count)

void main() 
{
    struct Player *players = NULL;
    int count = 0;
    int choice;

    storePlayers(&players, &count);

    do 
	{
        printf("\n--- Player Management ---\n");
        printf("1. Add Player\n2. Remove Player\n3. Search Player\n4. Update Player\n");
        printf("5. Display All Players\n6. Display Top 3 Players\n7. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch(choice) 
		{
            case 1: addPlayer(&players, &count); break;
            case 2: removePlayer(&players, &count); break;
            case 3: searchPlayer(players, count); break;
            case 4: updatePlayer(players, count); break;
            case 5: displayAll(players, count); break;
            case 6: displaySortedPlayers(players, count); break;
            case 7: printf("Exiting...\n"); break;
            default: printf("Invalid choice!\n");
        }
    } while(choice != 7);

    free(players);
}

// Store initial players
void storePlayers(struct Player **players, int *count) 
{
    int n;
    printf("Enter number of players to store initially: ");
    scanf("%d", &n);

    *players = (struct Player *)malloc(n * sizeof(struct Player));
    if(*players == NULL) 
	{
        printf("Memory allocation failed!\n");
        exit(1);
    }

    for(int i=0; i<n; i++) 
	{
        printf("\nEnter details for Player %d\n", i+1);
        printf("Jersey Number: "); scanf("%d", &(*players)[i].jerseyNo);
        printf("Name: "); scanf(" %[^\n]", (*players)[i].name);
        printf("Runs: "); scanf("%d", &(*players)[i].runs);
        printf("Wickets: "); scanf("%d", &(*players)[i].wickets);
        printf("Matches: "); scanf("%d", &(*players)[i].matches);
        (*count)++;
    }
    printf("%d players stored successfully!\n", n);
}

// Add a new player
void addPlayer(struct Player **players, int *count) 
{
    struct Player newPlayer;

    printf("\nEnter details for New Player\n");
    printf("Jersey Number: "); scanf("%d", &newPlayer.jerseyNo);
    printf("Name: "); scanf(" %[^\n]", newPlayer.name);
    printf("Runs: "); scanf("%d", &newPlayer.runs);
    printf("Wickets: "); scanf("%d", &newPlayer.wickets);
    printf("Matches: "); scanf("%d", &newPlayer.matches);

    *players = (struct Player *)realloc(*players, (*count + 1) * sizeof(struct Player));
    if(*players == NULL) 
	{
        printf("Memory reallocation failed!\n");
        exit(1);
    }

    (*players)[*count] = newPlayer;
    (*count)++;

    printf("Player added successfully!\n");
}

// Remove a player by Jersey Number
void removePlayer(struct Player **players, int *count)
{
    if(*count == 0) 
	{
        printf("No players to remove.\n");
        return;
    }

    int jersey;
    printf("Enter Jersey Number of player to remove: ");
    scanf("%d", &jersey);

    int found = -1;
    for(int i=0; i<*count; i++) 
	{
        if((*players)[i].jerseyNo == jersey) 
		{
            found = i;
            break;
        }
    }

    if(found == -1) 
	{
        printf("No player found with Jersey Number %d.\n", jersey);
        return;
    }

    for(int i=found; i < *count - 1; i++) 
	{
        (*players)[i] = (*players)[i+1];
    }

    (*count)--;

    *players = (struct Player *)realloc(*players, (*count) * sizeof(struct Player));
    if(*count > 0 && *players == NULL) 
	{
        printf("Memory reallocation failed after removal!\n");
        exit(1);
    }

    printf("Player with Jersey Number %d removed successfully!\n", jersey);
}

// Update Player Data (Runs, Wickets, Matches)
void updatePlayer(struct Player *players, int count) 
{
    if(count == 0) 
	{
        printf("No players to update.\n");
        return;
    }

    int jersey;
    printf("Enter Jersey Number of player to update: ");
    scanf("%d", &jersey);

    int found = -1;
    for(int i=0; i<count; i++) 
	{
        if(players[i].jerseyNo == jersey) 
		{
            found = i;
            break;
        }
    }

    if(found == -1) 
	{
        printf("No player found with Jersey Number %d.\n", jersey);
        return;
    }

    printf("\nUpdating Player: %s (Jersey %d)\n", players[found].name, players[found].jerseyNo);
    printf("Current Runs: %d, Wickets: %d, Matches: %d\n", players[found].runs, players[found].wickets, players[found].matches);

    printf("Enter new Runs: "); scanf("%d", &players[found].runs);
    printf("Enter new Wickets: "); scanf("%d", &players[found].wickets);
    printf("Enter new Matches: "); scanf("%d", &players[found].matches);

    printf("Player data updated successfully!\n");
}

// Display All Players
void displayAll(struct Player *players, int count) 
{
    if(count == 0) 
	{
        printf("No players.\n");
        return;
    }
    printf("\n--- All Players ---\n\n");
    for(int i=0; i<count; i++)
        printf("Player Id : %d\n Name : %s\n Runs : %d\n Wickets : %d\n Matches Played : %d\n\n",
               players[i].jerseyNo, players[i].name, players[i].runs,
               players[i].wickets, players[i].matches);
}

// Search Player by Jersey Number or Name
void searchPlayer(struct Player *players, int count) 
{
    if(count == 0) 
	{
        printf("No players to search.\n");
        return;
    }

    int searchChoice;
    printf("\nSearch Player By:\n1. Jersey Number\n2. Name\nEnter choice: ");
    scanf("%d", &searchChoice);

    if(searchChoice == 1) 
	{
        int jersey;
        printf("Enter Jersey Number: ");
        scanf("%d", &jersey);

        int found = 0;
        for(int i=0; i<count; i++) 
		{
            if(players[i].jerseyNo == jersey) 
			{
                printf("\nPlayer Found:\nPlayer Id : %d\n Name : %s\n Runs : %d\n Wickets : %d\n Matches Played : %d\n",
                       players[i].jerseyNo, players[i].name, players[i].runs,
                       players[i].wickets, players[i].matches);
                found = 1;
                break;
            }
        }
        if(!found)
            printf("No player found with Jersey Number %d.\n", jersey);
    }
    else if(searchChoice == 2) 
	{
        char name[50];
        printf("Enter Player Name: ");
        scanf(" %[^\n]", name);

        int found = 0;
        for(int i=0; i<count; i++) 
		{
            if(strcmp(players[i].name, name) == 0) 
			{
                printf("\nPlayer Found:\nPlayer Id : %d\n Name : %s\n Runs : %d\n Wickets : %d\n Matches Played : %d\n",
                       players[i].jerseyNo, players[i].name, players[i].runs,
                       players[i].wickets, players[i].matches);
                found = 1;
                break;
            }
        }
        if(!found)
            printf("No player found with Name %s.\n", name);
    }
    else 
	{
        printf("Invalid choice for search.\n");
    }
}

// Display Sorted Players
void displaySortedPlayers(struct Player *players, int count) 
{
    if (count == 0) 
	{
        printf("No players to display.\n");
        return;
    }

    int choice;
    printf("\nDisplay Players Sorted By:\n1. Maximum Runs\n2. Maximum Wickets\nEnter choice: ");
    scanf("%d", &choice);

    // Sort players
    for (int i = 0; i < count - 1; i++) 
	{
        for (int j = i + 1; j < count; j++) 
		{
            if ((choice == 1 && players[j].runs > players[i].runs) || (choice == 2 && players[j].wickets > players[i].wickets)) 
			{
                struct Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }
    }

    printf("\n--- Sorted Players ---\n");
    for (int i = 0; i < count; i++) 
	{
        printf("Jersey No: %d | Name: %s | Runs: %d | Wickets: %d | Matches: %d\n",
               players[i].jerseyNo, players[i].name,
               players[i].runs, players[i].wickets, players[i].matches);
    }
}
