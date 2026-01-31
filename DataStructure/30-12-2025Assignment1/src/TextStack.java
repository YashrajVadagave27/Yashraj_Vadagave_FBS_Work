public class TextStack {

    private String[] stack;
    private int top;

    public TextStack(int size) {
        stack = new String[size];
        top = -1;
    }

    public void push(String line) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow! Cannot add more lines.");
        } else {
            stack[++top] = line;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Nothing to undo.");
        } else {
            System.out.println("Undo line: " + stack[top]);
            top--;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty. No text available.");
        } else {
            System.out.println("\nCurrent Text:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}
