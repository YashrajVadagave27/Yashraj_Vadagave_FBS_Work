
public class Node {
	int data;
	Node next;
	Node pre;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.pre = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPre() {
		return pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}
	
	
}
