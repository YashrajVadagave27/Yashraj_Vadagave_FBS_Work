package ds_Stack_25_12;

public class Stack {
    int[] arr;
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int ele) {
        if (!isFull()) {
            arr[++top] = ele;
            System.out.println("Element pushed: " + ele);
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop() {
        if (!isEmpty()) {
            return arr[top--];
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
