public class CustomQueue {

    private String[] queue;
    private int front, rear;

    CustomQueue(int size) {
        queue = new String[size];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        if (rear == -1 && front == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if ((rear == queue.length - 1 && front == 0) || (rear + 1 == front)) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(String patientName) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (rear == -1) {         
            front = rear = 0;
        } else if (rear == queue.length - 1) {
            rear = 0;            
        } else {
            rear++;
        }

        queue[rear] = patientName;
        System.out.println(patientName + " added to list");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front] + " is called");

        if (front == rear) {      
            front = rear = -1;
        } else if (front == queue.length - 1) {
            front = 0;           
        } else {
            front++;
        }
    }

    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Waiting List: ");
        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }
}
