import java.util.Scanner;

public class TextStackDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        sc.nextLine();
        
        TextStack textStack = new TextStack(size);
        int choice;

        do {
            System.out.println("\n--- TEXT EDITOR USING STACK ---");
            System.out.println("1. Write a line (Push)");
            System.out.println("2. Undo last line (Pop)");
            System.out.println("3. Display current text");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter line: ");
                    String line = sc.nextLine();
                    textStack.push(line);
                    break;

                case 2:
                    textStack.pop();
                    break;

                case 3:
                    textStack.display();
                    break;

                case 4:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
