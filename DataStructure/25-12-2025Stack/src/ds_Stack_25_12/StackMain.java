package ds_Stack_25_12;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        int choice;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int ele = sc.nextInt();
                    stack.push(ele);
                    break;

                case 2:
                    int popped = stack.pop();
                    if (popped != -1)
                        System.out.println("Popped element: " + popped);
                    break;

                case 3:
                    int top = stack.peek();
                    if (top != -1)
                        System.out.println("Top element: " + top);
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}