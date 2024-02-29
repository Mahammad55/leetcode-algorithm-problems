package string.easy;

import java.util.Stack;

// 20
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{}()[]"));
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
