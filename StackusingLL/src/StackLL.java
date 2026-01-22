
public class StackLL {
	Node top;
	
	int size = 0;
	StackLL(){
		this.top = null;	
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) {
		Node temp = new Node(data);
		
		if(isEmpty()) {
			System.out.println("Stack is Empty. But I insert at 1st Position.");
			top = temp;
			size++;
			return;
		}else {
			temp.setNext(null);
			temp.setPre(top);
			top.setNext(temp);
			top = temp;
			size++;
			return;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}else if(top.getPre() == null) {
			top = null;
			size--;
			return;
		}else {
			top = top.getPre();
			top.setNext(null);
			size--;
			System.out.println("Top Data Deleted Successfully!!\n");
			return;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}else {
			System.out.println("\nThe Peek Element of Stack is: "+top.getData());
			return;
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}else {
			Node temp = top;
			while(temp != null) {
				System.out.println(temp.getData());
				temp = temp.getPre();
			}
		}
	}
}
