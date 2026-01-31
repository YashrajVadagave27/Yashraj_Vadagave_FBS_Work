import java.util.Scanner;

public class LinkedListMenu {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		
		while(true) {
			System.out.println("------Linked List Menu------");
			System.out.println("1. Simple Insert(Insert at End)");
			System.out.println("2. Display");
			System.out.println("3. Display Prime Number In LL");
			System.out.println("4. Sort LL Using Bubble Sort");
			System.out.println("5. Display LL in Reverse");
			System.out.println("6. Search Given Element in LL");
			System.out.println("7. Insert Element in Sorted Order(List must be Sorted)");
			System.out.println("8. Display Element in Sorted Order without changing Original LL");
			System.out.println("9. Exit");
		
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
			int data;
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
				l1.foundPrimeNo();
				break;
			case 4:	
				System.out.println("1. Ascending Order");
				System.out.println("2. Descending Order");
				System.out.println("Enter Choice: ");
				int ch1 = sc.nextInt();
				
				switch(ch1) {
				case 1:
					l1.bubbleSortASC();
					break;
				case 2:
					l1.bubbleSortDESC();
					break;
				case 3:
					System.out.println("Exiting From Sort");
					break;
				default :
					System.out.println("Invalid Choice in Sort");
				}
				break;
			case 5:
				l1.reverseDisplay();;
				break;
			case 6:
				System.out.println("Enter Number to Search: ");
				data = sc.nextInt();
				l1.searchLL(data);
				break;
			case 7:
				System.out.println("Enter Number to Insert: ");
				data = sc.nextInt();
				l1.insertInSorted(data);
				break;
			case 8:
				l1.displaySorted();
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
