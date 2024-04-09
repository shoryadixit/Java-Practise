import java.util.*;

public class Leetcode1544 {
    public static String makeGoodString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int asciiValue = (int) c;
            System.out.println(c + " -- " + asciiValue);
            if (i < s.length() - 1) {
                if (asciiValue != (int) s.charAt(i + 1)) {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGoodString(s));
    }
}