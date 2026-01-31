import java.util.Scanner;

public class LinkedListMenu {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		
		while(true) {
			System.out.println("------Linked List Menu------");
			System.out.println("1. Simple Insert(Insert at End)");
			System.out.println("2. Display");
			System.out.println("3. Insert at Start");
			System.out.println("4. Insert at Position");
			System.out.println("5. Delete at Position");
			System.out.println("6. Delete at Start");
			System.out.println("7. Delete at End");
			System.out.println("8. Exit");
		
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
			int data,pos;
			switch(ch) {
			case 1:
				System.out.println("Enter Number to Insert: ");
				data = sc.nextInt();
				l1.insert(data);
				break;
			case 2:
				l1.display();
				break;
			case 3:
				System.out.println("Enter Number to Insert: ");
				data = sc.nextInt();
				l1.insertAtStart(data);
				break;
			case 4:
				System.out.println("Enter Number to Insert: ");
				data = sc.nextInt();
				System.out.println("Enter Position at Number to be Insert: ");
				pos = sc.nextInt();
				l1.insertAtPosition(data, pos);
				break;
			case 5:
				System.out.println("Enter position to Delete Number: ");
				pos = sc.nextInt();
				l1.deleteAtPosition(pos);
				break;
			case 6:
				l1.deleteAtStart();
				break;
			case 7:
				l1.deleteAtEnd();
				break;
			case 8:
				System.out.println("Exiting...");
				break;
			default :
				System.out.println("Invalid Choice");
			}
		}
	}
}
