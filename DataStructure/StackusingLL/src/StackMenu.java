import java.util.Scanner;

public class StackMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		StackLL l1 = new StackLL();
		StackSinglyLL l1 = new StackSinglyLL();
		
		while(true) {
			System.out.println("-------Stack Menu-------");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("------------------------");
			
			System.out.print("\nEnter your Choice: ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("\nEnter your Data: ");
				int data = sc.nextInt();
				l1.push(data);
				System.out.println(data+" Inserted Successfully!!\n");
				break;
			case 2:
				l1.pop();
				break;
			case 3:
				l1.peek();
				System.out.println("Now The Size of Stack is: "+l1.size+"\n");
				break;
			case 4:
				System.out.println("\nStack Elements:");
				l1.display();
				System.out.println("\nNow The Size of Stack is: "+l1.size+"\n");
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Inavlid Choice");
				break;
			}
		}
	}
}
