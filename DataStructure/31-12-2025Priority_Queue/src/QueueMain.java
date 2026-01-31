import java.util.Scanner;

public class QueueMain {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter queue capacity: ");
	        int capacity = sc.nextInt();

	        Queue1 pq = new Queue1(capacity);
	        int choice;

	        do {
	            System.out.println("\n--- MIN Priority Queue Menu ---");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue (Remove Minimum)");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter number: ");
	                    pq.enqueue(sc.nextInt());
	                    break;
	                case 2:
	                    pq.dequeue();
	                    break;
	                case 3:
	                    pq.display();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        } while (choice != 4);

	        sc.close();
	    }
}
