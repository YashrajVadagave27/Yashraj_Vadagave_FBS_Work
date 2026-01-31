package ds_stack_cae_study_26_12;

class MyStack {
    char[] arr;
    int top;

    MyStack(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char x) {
        arr[++top] = x;
    }

    char pop() {
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
