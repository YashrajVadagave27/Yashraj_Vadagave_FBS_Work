import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = sc.nextInt();

//        Queue q = new Queue(size);
        Queue1 q = new Queue1(size);
        int choice;

        do {
            System.out.println("\n1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                	q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
