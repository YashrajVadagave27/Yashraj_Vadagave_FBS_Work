
public class LinkedList {
	Node start;
	int size=0;
	LinkedList(){
		start = null;
	}
	
	boolean isEmpty() {
		if(start == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insert(int ele) {
		if(isEmpty()) {
			start = new Node(ele);
			size++;
		}
		else {
			Node temp = start;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			Node temp1 = new Node(ele);
			temp.setNext(temp1);
			size++;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}else{
			Node temp = start;
			while(temp!=null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}

	public void foundPrimeNo() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			Node temp = start;
			System.out.println("Prime Numbers in LL: ");
			while(temp != null) {
				int no = temp.getData();
				if(no > 1) {
					int flag = 1;
					for(int i=2; i<=no/2; i++) {
						if(no%i == 0) {
							flag = 0;
							break;
						}
					}
					if(flag == 1) {
						System.out.println(no);
					}
				}
				temp = temp.getNext();
			}
		}
	}
	
	public void bubbleSortASC() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			for(int i=0; i<size-1; i++) {
				Node temp = start;
				System.out.println("Sorting LL With Ascending Order: ");
				while(temp.getNext() != null) {
					if(temp.getData()>temp.getNext().getData()) {
						int x = temp.getData();
						temp.setData(temp.getNext().getData());
						temp.getNext().setData(x);
					}
					temp = temp.getNext();
				}
			}
		}
	}

	public void bubbleSortDESC() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			for(int i=0; i<size-1; i++) {
				Node temp = start;
				System.out.println("Sorting LL With Ascending Order: ");
				while(temp.getNext() != null) {
					if(temp.getData()<temp.getNext().getData()) {
						int x = temp.getData();
						temp.setData(temp.getNext().getData());
						temp.getNext().setData(x);
					}
					temp = temp.getNext();
				}
			}
		}
	}

	public void searchLL(int data) {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			Node temp = start;
			int c=0;
			boolean found = false;
			while(temp != null) {
				if(temp.getData() == data) {
					System.out.println("The number "+data+" is found at position "+(c+1)+".");
					found  = true;
					break;
				}
				temp = temp.getNext();
				c++;
			}
			if(!found) {
				System.out.println("The number "+data+" is not found.");
			}
		}
	}

	public void insertInSorted(int data) {
		Node temp1 = new Node(data);
		if(isEmpty() || start.getData() > data) {
			temp1.setNext(start);
			start = temp1;
			size++;
			return;
		}
		else {
			Node temp = start;
			while(temp.getNext() != null && temp.getNext().getData() < data) {
				temp = temp.getNext();
			}
			temp1.setNext(temp.getNext());
			temp.setNext(temp1);
			size++;
		}
	}

	public void displaySorted() {
		LinkedList newLinkedList = new LinkedList();
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}else {
			Node temp = start;
			while(temp != null) {
				newLinkedList.insert(temp.getData());
				temp = temp.getNext();
			}
			
			newLinkedList.bubbleSortASC();
			newLinkedList.display();
		}
	}
	
	public void reverseDisplay() {
		System.out.println("Reverse Display:");
		reverse(start);
	}

	public void reverse(Node temp) {
		if (temp == null)
	    	return;

		reverse(temp.next);    
	   	System.out.println(temp.data + " ");
	}
}
