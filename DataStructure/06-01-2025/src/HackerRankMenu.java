import java.util.Scanner;

public class HackerRankMenu {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		while(true) {
			System.out.println("------Linked List Menu------");
			System.out.println("1. Simple Insert(Insert at End)");
			System.out.println("2. Display");
			System.out.println("3. Check Two List Are Identical / Not");
			System.out.println("4. Exit\n");
		
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
			int data;
			switch(ch) {
			case 1:
				System.out.println("1. To Insert In List-1");
				System.out.println("2. To Insert In List-2");
				System.out.println("Enter Your Choice: ");
				int x = sc.nextInt();
				switch(x) {
				case 1:
					System.out.println("Enter Number to Insert: ");
					data = sc.nextInt();
					l1.insert(data);
					System.out.println();
					break;
				case 2:
					System.out.println("Enter Number to Insert: ");
					data = sc.nextInt();
					l2.insert(data);
					System.out.println();
					break;
				}
				break;
			case 2:
				System.out.println("List-1: ");
				l1.display();
				System.out.println();
				System.out.println("\nList-2: ");
				l2.display();
				System.out.println();
				break;
			case 3:
				if(compareList(l1,l2)) {
					System.out.println("True!!..\nBoth are Identical..\nLength and Elements are Same..");
				}else {
					System.out.println("False!!..\nBoth are Not Identical..\nLength or Elements are Different..");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default :
				System.out.println("Invalid Choice");
			}
		}
	}
	
	static boolean compareList(LinkedList l1, LinkedList l2){
		Node temp = l1.start;
		Node temp2 = l2.start;
		while(temp != null && temp2 != null) {
			if(temp.getData() != temp2.getData()) {
				return false;
			}
			temp = temp.getNext();
			temp2 = temp2.getNext();
		}
		return temp == null && temp2 == null;
		
	}
}
