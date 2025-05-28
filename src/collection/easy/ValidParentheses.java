package collection.easy;

import java.util.Stack;

// 20
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}()[]"));
    }

    public static boolean isValid1(String input) {
        Stack<Character> stack = new Stack<>();
        String opening = "{([";
        String closing = "})]";

        for (char ch : input.toCharArray()) {
            int pos = opening.indexOf(ch);
            if (pos != -1) {
                stack.push(closing.charAt(pos));
            } else if (stack.empty() || stack.peek() != ch) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (!((top == '{' && ch == '}') ||
                        (top == '[' && ch == ']') ||
                        (top == '(' && ch == ')'))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
