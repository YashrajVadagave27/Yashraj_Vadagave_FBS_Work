
public class Node {
	Employee data;
	Node next;
	Node pre;
	
	Node(Employee ele){
		data = ele;
		next = null;
		pre = null;
	}

	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
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
