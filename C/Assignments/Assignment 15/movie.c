#include <stdio.h>
#include <string.h>

struct Movie 
{
    char title[100];
    char director[50];
    int year;
    char genre[30];
};

void addMovies(struct Movie db[], int *n) 
{
    int count;
    printf("How many movies do you want to add? ");
    scanf("%d", &count);

    for (int i = 0; i < count; i++) 
	{
        printf("\nEnter details for Movie %d\n", *n + 1);
        printf("Title: ");
        scanf(" %[^\n]", db[*n].title);
        printf("Director: ");
        scanf(" %[^\n]", db[*n].director);
        printf("Release Year: ");
        scanf("%d", &db[*n].year);
        printf("Genre: ");
        scanf(" %[^\n]", db[*n].genre);
        (*n)++;
    }
}

void displayMovies(struct Movie db[], int n) 
{
    if (n == 0) 
	{
        printf("\nNo movies in database!\n");
        return;
    }

    printf("\n Movie Database \n");
    for (int i = 0; i < n; i++) 
	{
        printf("%d. %s | Director: %s | Year: %d | Genre: %s\n",
               i + 1, db[i].title, db[i].director, db[i].year, db[i].genre);
    }
}

void searchMovie(struct Movie db[], int n) 
{
    char searchTitle[100];
    printf("Enter movie title to search: ");
    scanf(" %[^\n]", searchTitle);

    for (int i = 0; i < n; i++) 
	{
        if (strcmp(db[i].title, searchTitle) == 0) 
		{
            printf("\nMovie Found:\n");
            printf("Title: %s\nDirector: %s\nYear: %d\nGenre: %s\n",
                   db[i].title, db[i].director, db[i].year, db[i].genre);
            return;
        }
    }
    printf("\nMovie not found!\n");
}

void updateMovie(struct Movie db[], int n) 
{
    char searchTitle[100];
    printf("Enter movie title to update: ");
    scanf(" %[^\n]", searchTitle);

    for (int i = 0; i < n; i++) 
	{
        if (strcmp(db[i].title, searchTitle) == 0) 
		{
            printf("\nUpdating record for %s\n", db[i].title);
            printf("New Title: ");
            scanf(" %[^\n]", db[i].title);
            printf("New Director: ");
            scanf(" %[^\n]", db[i].director);
            printf("New Release Year: ");
            scanf("%d", &db[i].year);
            printf("New Genre: ");
            scanf(" %[^\n]", db[i].genre);
            printf("\nMovie record updated successfully!\n");
            return;
        }
    }
    printf("\nMovie not found!\n");
}

void main() 
{
    struct Movie database[50];
    int n = 0, choice;

    do 
	{
        printf("\n Movie Database Menu \n");
        printf("1. Add Movie\n");
        printf("2. Display All Movies\n");
        printf("3. Search Movie by Title\n");
        printf("4. Update Movie\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) 
		{
            case 1: addMovies(database, &n); break;
            case 2: displayMovies(database, n); break;
            case 3: searchMovie(database, n); break;
            case 4: updateMovie(database, n); break;
            case 0: printf("Exiting...\n"); break;
            default: printf("Invalid choice! Try again.\n");
        }
    } while (choice != 0);

}
