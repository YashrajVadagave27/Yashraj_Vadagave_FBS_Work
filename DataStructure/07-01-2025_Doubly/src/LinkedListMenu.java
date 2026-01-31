import java.util.Scanner;

public class LinkedListMenu {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		DLL d = new DLL();
		
		while(true) {
			System.out.println("------Linked List Menu------");
			System.out.println("1. Insert at Position");
			System.out.println("2. Display");
			System.out.println("3. Insert at Start");
			System.out.println("4. Simple insert or Insert at End");
			System.out.println("5. Delete at Start");
			System.out.println("6. Delete at End");
			System.out.println("7. Display Reverse");
			System.out.println("8. Delete at Position");
			System.out.println("9. Exit");
		
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
			int data, pos;
			switch(ch) {
			case 1:
				System.out.println("Enter Number to Insert: ");
				data = sc.nextInt();
				System.out.println("Enter Position to Insert: ");
				pos = sc.nextInt();
				d.insertPosition(data, pos);
				break;
			case 2:
				d.display();
				break;
			case 3:
				System.out.println("Enter Number to Insert: ");
				data = sc.nextInt();
				d.insertStart(data);
				break;
			case 4:	
				System.out.println("Enter Number to Insert: ");
				data = sc.nextInt();
				d.insertEnd(data);
				break;
			case 5:
				d.deleteStart();
				break;
			case 6:
				d.deleteEnd();
				break;
			case 7:
				d.displayReverse();
				break;
			case 8:
				System.out.println("Enter Number to Insert: ");
				pos = sc.nextInt();
				d.deletePosition(pos);
				break;
			case 9:
				System.out.println("Exiting...");
				break;
			default :
				System.out.println("Invalid Choice");
			}
		}
	}
}
