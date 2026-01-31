package ds_stack_cae_study_26_12;

import java.util.Scanner;

class MyStack1 {
    int[] arr;
    int top;

    MyStack1(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        arr[++top] = x;
    }

    int pop() {
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

class EvaluatePostfix {

    int evaluate(String exp) {

        MyStack1 obj = new MyStack1(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                obj.push(ch - '0');
            }

            else {
                int b = obj.pop();
                int a = obj.pop();

                switch (ch) {
                    case '+':
                        obj.push(a + b);
                        break;
                    case '-':
                        obj.push(a - b);
                        break;
                    case '*':
                        obj.push(a * b);
                        break;
                    case '/':
                        obj.push(a / b);
                        break;
                }
            }
        }
        return obj.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvaluatePostfix p = new EvaluatePostfix();

        System.out.print("Enter postfix expression: ");
        String exp = sc.nextLine();

        int result = p.evaluate(exp);
        System.out.println("Result = " + result);

        sc.close();
    }
}

