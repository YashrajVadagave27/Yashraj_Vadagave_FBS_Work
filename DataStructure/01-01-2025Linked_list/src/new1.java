
public class new1 {
	public void insertAtPosition(int data, int pos){
		Node temp1 = new Node(data);
		if(pos< 0 || pos > size+1) {
			System.out.println("Invalid Position");
			return;
		}
		if(isEmpty()) {
			start = new Node(data);
			size++;
			System.out.println("List is Empty But I am Insert given Number at Start");
			return;
		}else if(pos == 1){
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
		
		public void deleteAtPosition(int pos) {
			if(isEmpty()) {
				System.out.println("List is Empty");
				return;
			}else if(pos == 1) {
				start = start.getNext();
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
