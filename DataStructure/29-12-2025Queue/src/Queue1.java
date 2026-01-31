public class Queue1 {
    int[] arr;
    int rear, front;

    Queue1(int size) {
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
		 if((rear == arr.length-1 && front == 0) || (rear+1 == front))
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

        if (rear == -1) {
            front = rear = 0;
        }else if(rear == arr.length-1) {
        	rear = 0;
        }else {
        	rear++;
        }
        arr[rear] = data;
        System.out.println(data + " inserted");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " removed");

        if (front == rear) {
            front = rear = -1;
        }else if(front == arr.length-1) {
        	front = 0;
    	}else {
            front++;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % arr.length;
        }
        System.out.println();
    }
}
