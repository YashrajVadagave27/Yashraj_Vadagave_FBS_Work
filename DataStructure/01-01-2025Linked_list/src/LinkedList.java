
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
			System.out.println("List is Empty But I am Insert given Number at Start");
			return;
		}
		else {
			Node temp = start;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			Node temp1 = new Node(ele);
			temp.setNext(temp1);
			size++;
			return;
		}
	}
	
	public void display() {
		if(isEmpty()){
			System.out.println("List is Empty");
			return;
		}else {
			Node temp = start;
			while(temp!=null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}

	public void insertAtStart(int ele) {
		if(isEmpty()) {
			start = new Node(ele);
			size++;
			System.out.println("List is Empty But I am Insert given Number at Start");
			return;
		}else {
			Node temp = new Node(ele);
			temp.setNext(start);
			start = temp;
			size++;
			return;
		}
	}
	
	public void insertAtPosition(int data, int pos){
		Node temp1 = new Node(data);
		if(isEmpty()) {
			start = new Node(data);
			size++;
			System.out.println("List is Empty But I am Insert given Number at Start");
			return;
		}else if(pos <= 0 || pos >= size+2) {
			System.out.println("Invalid Position");
			return;
		}else {
			if(pos == 1){
				temp1.setNext(start);
				start = temp1;
				size++;
				return;
			}else {
				Node temp = start;
				int c = 1;
				while(temp.getNext() != null && c < pos-1) {
					temp = temp.getNext();
					c++;
				}
				temp1.setNext(temp.getNext());
				temp.setNext(temp1);
				size++;
				return;
			}
		}
	}
	
	public void deleteAtStart() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			start = start.getNext();
			size--;
			return;
		}
	}
	
	public void deleteAtPosition(int pos) {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}else if(pos <= 0 || pos > size) {
			System.out.println("Invalid Position");
			return;
		}else {
			if(pos == 1) {
				start  = start.getNext();
				size--;
				return;
			}else {
				int c=1;
				Node temp = start;
				while(temp.getNext() != null && c < pos-1) {
					temp = temp.getNext();
					c++;
				}
				if(c < pos && temp.getNext() == null) {
					System.out.println("Invalid Position");
					return;
				}
				temp.setNext(temp.getNext().getNext());
				size--;
				return;
			}
		}
	}

	public void deleteAtEnd() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else if(size == 1){
			start = start.getNext();
			size--;
			return;
			
		}else {
			int c=1;
			Node temp = start;
			while(temp.getNext() != null && c < size-1) {
				temp = temp.getNext();
				c++;
			}
			temp.setNext(null);
			size--;
			return;
			
		}
		
	}
}
