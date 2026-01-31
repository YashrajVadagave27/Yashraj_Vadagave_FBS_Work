import java.util.Scanner;

public class HospitalAppointmentSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        sc.nextLine();

        CustomQueue queue = new CustomQueue(size);
        int choice;

        do {
            System.out.println("\n--- Hospital Appointment Menu ---");
            System.out.println("1. Add Patient (Enqueue)");
            System.out.println("2. Call Next Patient (Dequeue)");
            System.out.println("3. Display Waiting List");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    queue.enqueue(name);
                    break;

                case 2:
                	queue.dequeue();
                    break;

                case 3:
                    queue.displayQueue();
                    break;

                case 4:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
