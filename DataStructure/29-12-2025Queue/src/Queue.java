//linear queue
public class Queue {
	 int[] arr;
	 int rear, front;

	 Queue(int size) {
		 arr = new int[size];
	     rear = -1;
	     front = -1;
	 }
	 
	 boolean isEmpty(){
		 if(rear == -1 && front == -1) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 boolean isFull(){
		 if(rear == arr.length-1)
		 {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 void enqueue(int data) {
		 if (isFull()) {
			 System.out.println("Queue is Full");
	         return;
	     }
		 if (isEmpty()) {
	         front = 0;
	     }
		 
		 rear++; 
		 arr[rear] = data;
		 System.out.println(data + " inserted");
	}
	 
	void dequeue() {
		if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " removed");
		front++;
//        if (front == rear) {
//            front = rear = -1;
//        } else {
//            front++;
//        }
	}
	 
	void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
	        return;
	    }

	    System.out.print("Queue elements: ");
	    for (int i = front; i <= rear; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
}
