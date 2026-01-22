import java.util.Scanner;

public class BST<T extends Comparable<T>> {
	Scanner sc = new Scanner(System.in);
	
    Node<T> root;

    BST() {
        root = null;
    }

    public void insertData(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> temp, T data) {
        if (temp == null) {
            return new Node<>(data);
        }

        if (data.compareTo(temp.data) < 0) {
            temp.left = insert(temp.left, data);
        } else {
            temp.right = insert(temp.right, data);
        }
        return temp;
    }
    
    public void display() {
    	System.out.println("1. Inorder");
    	System.out.println("2. Preorder");
    	System.out.println("3. Postorder");
    	
    	System.out.println("Enter your choice: ");
    	int ch = sc.nextInt();
    	
    	if(ch==1) {
    		inorder(root);
    	}else if(ch==2) {
    		preorder(root);
    	}else if(ch==3) {
    		postorder(root);
    	}else {
    		System.out.println("Inavlid choice");
    	}
    	
    }
    
    private void inorder(Node<T> temp) {
		if(temp != null) {
			inorder(temp.getLeft());
			System.out.println(temp.getData());
			inorder(temp.getRight());
		}
		
	}
    
    private void preorder(Node<T> temp) {
		if(temp != null) {
			System.out.println(temp.getData());
			preorder(temp.getLeft());
			preorder(temp.getRight());
		}
		
	}
    
    private void postorder(Node<T> temp) {
		if(temp != null) {
			postorder(temp.getLeft());
			postorder(temp.getRight());
			System.out.println(temp.getData());
		}
		
	}
//    public void displayTree() {
//        display(root, 0, "Root");
//    }
//
//    private void display(Node<T> node, int level, String position) {
//        if (node == null) {
//            return;
//        }
//
//        for (int i = 0; i < level; i++) {
//            System.out.print("    ");
//        }
//
//        System.out.println(position + ": " + node.data);
//
//        display(node.left, level + 1, "L");
//        display(node.right, level + 1, "R");
//    }

	

}
