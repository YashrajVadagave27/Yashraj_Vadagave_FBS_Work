#include <stdio.h>
#include <string.h>

struct Player 
{
    char name[50];
    int matches;
    int runs;
    int wickets;
};

void acceptPlayers(struct Player p[], int n) 
{
    for (int i = 0; i < n; i++) {
        printf("\nEnter details for Player %d\n", i + 1);
        printf("Name: ");
        scanf(" %[^\n]", p[i].name);
        printf("Matches Played: ");
        scanf("%d", &p[i].matches);
        printf("Runs: ");
        scanf("%d", &p[i].runs);
        printf("Wickets: ");
        scanf("%d", &p[i].wickets);
    }
}

void displayPlayers(struct Player p[], int n) 
{
    printf("\n Player Information \n");
    for (int i = 0; i < n; i++) {
        printf("%d. Name: %s | Matches: %d | Runs: %d | Wickets: %d\n",
               i + 1, p[i].name, p[i].matches, p[i].runs, p[i].wickets);
    }
}

void bestPlayers(struct Player p[], int n) 
{
    int maxRunsIndex = 0, maxWicketsIndex = 0;

    for (int i = 1; i < n; i++) {
        if (p[i].runs > p[maxRunsIndex].runs)
            maxRunsIndex = i;
        if (p[i].wickets > p[maxWicketsIndex].wickets)
            maxWicketsIndex = i;
    }

    printf("\nPlayer with Maximum Runs: %s (%d runs)\n",
           p[maxRunsIndex].name, p[maxRunsIndex].runs);
    printf("Player with Maximum Wickets: %s (%d wickets)\n",
           p[maxWicketsIndex].name, p[maxWicketsIndex].wickets);
}

void main() 
{
    struct Player players[10]; 
    int n;

    printf("How many players? (<=10): ");
    scanf("%d", &n);

    acceptPlayers(players, n);
    displayPlayers(players, n);
    bestPlayers(players, n);

}
