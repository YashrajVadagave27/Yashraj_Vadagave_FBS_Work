import java.util.Scanner;

class InvalidMovieSelectionException extends Exception {
    public String toString() {
        return "Error: Invalid movie selection! Please choose a valid option.";
    }
}

class InvalidTicketNumberException extends Exception {
    public String toString() {
        return "Error: Number of tickets must be greater than 0.";
    }
}

class TicketsSoldOutException extends Exception {
    public String toString() {
        return "Error: Requested number of tickets is not available!";
    }
}

class MovieBooking {

    static int ticketPrice = 200;
    static int maxAvailableTickets = 50;

    String movieName;
    int tickets;

    MovieBooking(String movieName, int tickets) {
        this.movieName = movieName;
        this.tickets = tickets;
    }

    public void bookTickets() throws InvalidTicketNumberException,
            TicketsSoldOutException {

        if (tickets <= 0) {
            throw new InvalidTicketNumberException();
        }

        if (tickets > maxAvailableTickets) {
            throw new TicketsSoldOutException();
        }

        maxAvailableTickets -= tickets;

        int totalAmount = tickets * ticketPrice;

        System.out.println("\nBooking Successful for \"" + movieName + "\"!");
        System.out.println("Tickets booked: " + tickets);
        System.out.println("Total amount: ₹" + totalAmount);
        System.out.println("Remaining Tickets: " + maxAvailableTickets);
    }

    public static boolean ticketsRemaining() {
        return maxAvailableTickets > 0;
    }

    public String toString() {
        return "\n--- Booking Details ---" +
               "\nMovie: " + movieName +
               "\nTickets: " + tickets +
               "\nPrice per Ticket: ₹" + ticketPrice;
    }
}

public class MovieBookingTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] movies = {
                "3 Idiots",
                "Dangal",
                "Bahubali 2: The Conclusion",
                "Kabir Singh",
                "Chhichhore",
                "Zindagi Na Milegi Dobara",
                "Tanhaji",
                "Uri: The Surgical Strike",
                "War",
                "Bajrangi Bhaijaan"
        };

        System.out.println("Welcome to Bollywood Movie Ticket Booking System!");

        while (MovieBooking.ticketsRemaining()) {

            System.out.println("\n===== Available Movies =====");
            for (int i = 0; i < movies.length; i++) {
                System.out.println((i + 1) + ". " + movies[i]);
            }

            System.out.print("\nSelect movie number: ");
            int choice = sc.nextInt();

            try {
                if (choice < 1 || choice > movies.length) {
                    throw new InvalidMovieSelectionException();
                }

                System.out.print("Enter number of tickets: ");
                int tickets = sc.nextInt();

                MovieBooking booking =
                        new MovieBooking(movies[choice - 1], tickets);

                System.out.println(booking.toString());

                booking.bookTickets();

            } catch (InvalidMovieSelectionException e) {
                System.out.println(e);
            } catch (InvalidTicketNumberException e) {
                System.out.println(e);
            } catch (TicketsSoldOutException e) {
                System.out.println(e);
            }
        }

        System.out.println("\nSorry! Tickets are sold out.");
        sc.close();
    }
}
