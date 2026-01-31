
public class DLL {
	Node start;
	Node last;
	int size = 0;
	DLL(){
		start = null;
		last = null;
	}
	
	public boolean isEmpty() {
		if(start == null && last == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertStart(int data) {
		Node temp = new Node(data);
		if(isEmpty()) {
			start = last = temp;
			size++;
			System.out.println("List is Empty but i am Insert Element at Start");
			return;
		}else {
			temp.setNext(start);
			start.setPre(temp);
			start = temp;
			size++;
			return;
		}
	}
	
	public void insertEnd(int data) {
		Node temp = start;
		Node temp1 = new Node(data);
		
		if(isEmpty()) {
			start = last = temp1;
			size++;
			System.out.println("List is Empty but i am Insert Element at Start");
			return;
		}else {
//			while(temp.getNext() != null) {
//				temp = temp.getNext();
//			}
//			temp1.setPre(temp);
//			temp.setNext(temp1);
//			last = temp1;
//			size++;
//			return;
			
			temp1.setPre(last);
			last.setNext(temp1);
			last = temp1;
			size++;
			return;
		}
	}
	
	public void insertPosition(int data, int pos) {
		Node temp1 = new Node(data);
		if(isEmpty()) {
			start = last = temp1;
			size++;
			System.out.println("List is Empty but i am Insert Element at Start");
			return;
		}else if(pos <= 0 || pos >= size+2) {
			System.out.println("Invalid Position");
			return;
		}else {
			if(pos == 1) {
				temp1.setNext(start);
				start.setPre(temp1);
				start = temp1;
				size++;
				return;
			}else {
				Node temp = start;
				int c=1;
				while(temp.getNext() != null && c < pos-1) {
					temp = temp.getNext();
					c++;
				}
				if(temp.getNext() == null) {
					temp1.setPre(temp);
					temp.setNext(temp1);
					last = temp1;
					size++;
					return;
				}
				temp1.setNext(temp.getNext());
				temp1.setPre(temp);
				temp.getNext().setPre(temp1);
				temp.setNext(temp1);
				size++;
				return;
			}
		}
	}
	
	public void deleteStart() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}else if(size == 1) {
			start = last = null;
			size--;
			return;
		}else {
			start = start.getNext();
			start.setPre(null);
			size--;
			return;
		}
	}
	
	public void deleteEnd() {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}else if(size == 1) {
			start = null;
			last = null;
			size--;
			return;
		}else {
			last = last.getPre();
			last.setNext(null);
			size--;
			return;
//			Node temp = start;
//			int c=1;
//			while(temp.getNext() != null && c < size-1) {
//				temp = temp.getNext();
//			}
//			last = temp;
//			temp.setNext(null);
//			size--;
//			return;
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}else if(pos > size || pos <= 0) {
			System.out.println("Invalid Position");
			return;
		}else if(pos == 1) {
			start = start.getNext();
			start.setPre(null);
			size--;
			return;
		}else if(pos == size) {
			last = last.getPre();
			last.setNext(null);
			size--;
			return;
		}else {
			Node temp = start;
			int c =1;
			while(c < pos) {
				temp = temp.getNext();
				c++;
			}
			temp.getPre().setNext(temp.getNext());
			temp.getNext().setPre(temp.getPre());
			size--;
			return;
		}
	}
	
	public void display() {
		Node temp = start;
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			while(temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}
	
	public void displayReverse() {
		Node temp = last;
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else {
			while(temp != null) {
				System.out.println(temp.getData());
				temp = temp.getPre();
			}
		}
	}
}
