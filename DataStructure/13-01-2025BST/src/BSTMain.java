import java.util.Scanner;

public class BSTMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BST<String> b = new BST<>();

        while (true) {
            System.out.println("1. Insert Into BST");
            System.out.println("2. Display BST");
            System.out.println("3. Exit");

            System.out.print("Enter Your Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data: ");
                    String str = sc.next();
                    b.insertData(str);
                    break;
                case 2:
                	b.display();
                	break;
//                case 2:
//                	b.displayTree();
//                	break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
