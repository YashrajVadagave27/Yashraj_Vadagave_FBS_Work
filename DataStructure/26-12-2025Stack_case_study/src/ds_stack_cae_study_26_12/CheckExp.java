package ds_stack_cae_study_26_12;

import java.util.*;

class CheckExp {

    boolean checkExp(String s) {

        MyStack obj = new MyStack(s.length());

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                obj.push(x);
            }

            else if (x == ')' || x == '}' || x == ']') {

                if (obj.isEmpty())
                    return false;

                char y = obj.pop();

                if (x == ')' && y == '(')
                    continue;
                if (x == '}' && y == '{')
                    continue;
                if (x == ']' && y == '[')
                    continue;

                return false;
            }
        }

        return obj.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String exp = sc.nextLine();

        CheckExp c = new CheckExp();

        if (c.checkExp(exp))
            System.out.println("Balanced Expression");
        else
            System.out.println("Not Balanced Expression");

        sc.close();
    }
}