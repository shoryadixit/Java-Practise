package DSAlab.Stack;

import java.util.Stack;

public class PostFixEvaluation {
    static Integer expression(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                stack.push((Integer.valueOf("" + c)));
            }
            if (c == '+') {
                int a = stack.pop();
                int b = stack.pop();
                int d = operator(c, a, b);
                stack.push(d);
            }
            if (c == '-') {
                int a = stack.pop();
                int b = stack.pop();
                int d;
                if (a < b) {
                    d = operator(c, b, a);
                } else {
                    d = operator(c, a, b);
                }
                stack.push(d);
            }
            if (c == '*') {
                int a = stack.pop();
                int b = stack.pop();
                int d = operator(c, a, b);
                stack.push(d);
            }
            if (c == '/') {
                int a = stack.pop();
                int b = stack.pop();
                int d;
                if (a < b) {
                    d = operator(c, b, a);
                } else {
                    d = operator(c, a, b);
                }
                stack.push(d);
            }
        }
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return null;
    }

    static int operator(char ch, int a, int b) {
        return switch (ch) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b / a;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        String exp = "";
        System.out.println(expression(exp));
    }
}