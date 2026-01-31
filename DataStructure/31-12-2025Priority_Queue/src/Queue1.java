public class Queue1 {

    int[] arr;
    int front, rear;

    Queue1(int capacity) {
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return rear == arr.length - 1;
    }

    void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = data;
            System.out.println(data + " inserted");
            return;
        }

        int i = rear;

        while (i >= front && arr[i] > data) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i + 1] = data;
        rear++;

        System.out.println(data + " inserted");
    }

    void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " removed");

        for (int i = front; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;

        if (rear < front) {
            front = rear = -1;
        }
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("MIN Priority Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
