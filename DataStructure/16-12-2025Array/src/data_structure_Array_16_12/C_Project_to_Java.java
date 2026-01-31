package data_structure_Array_16_12;

import java.util.ArrayList;
import java.util.Scanner;

public class C_Project_to_Java {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Player> players = new ArrayList<>();

    public static void main(String[] args) {

        storePlayers();

        int choice;
        do {
            System.out.println("\n--- Player Management ---");
            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. Search Player");
            System.out.println("4. Update Player");
            System.out.println("5. Display All Players");
            System.out.println("6. Display Sorted Players");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addPlayer();
                case 2 -> removePlayer();
                case 3 -> searchPlayer();
                case 4 -> updatePlayer();
                case 5 -> displayAll();
                case 6 -> displaySortedPlayers();
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }

    // Store initial players
    static void storePlayers() {
        System.out.print("Enter number of players to store initially: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Player " + (i + 1));
            System.out.print("Jersey Number: ");
            int jersey = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Runs: ");
            int runs = sc.nextInt();

            System.out.print("Wickets: ");
            int wickets = sc.nextInt();

            System.out.print("Matches: ");
            int matches = sc.nextInt();

            players.add(new Player(jersey, name, runs, wickets, matches));
        }
        System.out.println(n + " players stored successfully!");
    }

    // Add Player
    static void addPlayer() {
        System.out.println("\nEnter details for New Player");
        System.out.print("Jersey Number: ");
        int jersey = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Runs: ");
        int runs = sc.nextInt();

        System.out.print("Wickets: ");
        int wickets = sc.nextInt();

        System.out.print("Matches: ");
        int matches = sc.nextInt();

        players.add(new Player(jersey, name, runs, wickets, matches));
        System.out.println("Player added successfully!");
    }

    // Remove Player
    static void removePlayer() {
        if (players.isEmpty()) {
            System.out.println("No players to remove.");
            return;
        }

        System.out.print("Enter Jersey Number to remove: ");
        int jersey = sc.nextInt();

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).jerseyNo == jersey) {
                players.remove(i);
                System.out.println("Player removed successfully!");
                return;
            }
        }
        System.out.println("No player found with Jersey Number " + jersey);
    }

    // Update Player
    static void updatePlayer() {
        if (players.isEmpty()) {
            System.out.println("No players to update.");
            return;
        }

        System.out.print("Enter Jersey Number to update: ");
        int jersey = sc.nextInt();

        for (Player p : players) {
            if (p.jerseyNo == jersey) {
                System.out.println("Updating Player: " + p.name);
                System.out.print("New Runs: ");
                p.runs = sc.nextInt();
                System.out.print("New Wickets: ");
                p.wickets = sc.nextInt();
                System.out.print("New Matches: ");
                p.matches = sc.nextInt();

                System.out.println("Player updated successfully!");
                return;
            }
        }
        System.out.println("No player found.");
    }

    // Display All Players
    static void displayAll() {
        if (players.isEmpty()) {
            System.out.println("No players.");
            return;
        }

        System.out.println("\n--- All Players ---");
        for (Player p : players) {
            System.out.println("Jersey No : " + p.jerseyNo);
            System.out.println("Name : " + p.name);
            System.out.println("Runs : " + p.runs);
            System.out.println("Wickets : " + p.wickets);
            System.out.println("Matches Played : " + p.matches);
            System.out.println();
        }
    }

    // Search Player
    static void searchPlayer() {
        if (players.isEmpty()) {
            System.out.println("No players to search.");
            return;
        }

        System.out.println("Search By:\n1. Jersey Number\n2. Name");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            System.out.print("Enter Jersey Number: ");
            int jersey = sc.nextInt();
            for (Player p : players) {
                if (p.jerseyNo == jersey) {
                    displayPlayer(p);
                    return;
                }
            }
            System.out.println("Player not found.");
        } else if (ch == 2) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            for (Player p : players) {
                if (p.name.equalsIgnoreCase(name)) {
                    displayPlayer(p);
                    return;
                }
            }
            System.out.println("Player not found.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static void displayPlayer(Player p) {
        System.out.println("\nPlayer Found:");
        System.out.println("Jersey No: " + p.jerseyNo);
        System.out.println("Name: " + p.name);
        System.out.println("Runs: " + p.runs);
        System.out.println("Wickets: " + p.wickets);
        System.out.println("Matches: " + p.matches);
    }

    // Display Sorted Players
    static void displaySortedPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players to display.");
            return;
        }

        System.out.println("Sort By:\n1. Maximum Runs\n2. Maximum Wickets");
        int choice = sc.nextInt();

        for (int i = 0; i < players.size() - 1; i++) {
            for (int j = i + 1; j < players.size(); j++) {
                Player p1 = players.get(i);
                Player p2 = players.get(j);

                if ((choice == 1 && p2.runs > p1.runs) ||
                    (choice == 2 && p2.wickets > p1.wickets)) {
                    players.set(i, p2);
                    players.set(j, p1);
                }
            }
        }

        displayAll();
    }
}
