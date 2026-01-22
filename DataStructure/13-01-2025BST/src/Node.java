public class Node<T>  {
    T data;
    Node<T> left;
    Node<T> right;

    Node(T ele) {
        data = ele;
        left = null;
        right = null;
    }
    
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}
}
