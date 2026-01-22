import java.util.Scanner;

public class LinkedListMenu {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Employee e1;
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
			int pos;
			switch(ch) {
			case 1:
				e1 = new Employee();
				System.out.println("Enter ID: ");
				e1.id = sc.nextInt();
				System.out.println("Enter Name: ");
				e1.name = sc.next();
				System.out.println("Enter Salary: ");
				e1.salary = sc.nextInt();
				System.out.println("Enter Department: ");
				e1.dept = sc.next();
				System.out.println("Enter Position to Insert: ");
				pos = sc.nextInt();
				d.insertPosition(e1, pos);
				break;
			case 2:
				d.display();
				break;
			case 3:
				e1 = new Employee();
				System.out.println("Enter ID: ");
				e1.id = sc.nextInt();
				System.out.println("Enter Name: ");
				e1.name = sc.next();
				System.out.println("Enter Salary: ");
				e1.salary = sc.nextInt();
				System.out.println("Enter Department: ");
				e1.dept = sc.next();
				d.insertStart(e1);
				break;
			case 4:	
				e1 = new Employee();
				System.out.println("Enter ID: ");
				e1.id = sc.nextInt();
				System.out.println("Enter Name: ");
				e1.name = sc.next();
				System.out.println("Enter Salary: ");
				e1.salary = sc.nextInt();
				System.out.println("Enter Department: ");
				e1.dept = sc.next();
				d.insertEnd(e1);
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
				System.out.println("Enter Position to Delete: ");
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
