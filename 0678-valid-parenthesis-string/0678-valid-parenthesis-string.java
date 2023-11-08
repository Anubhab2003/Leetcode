import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> asteriskStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                openStack.push(i);
            } else if (ch == '*') {
                asteriskStack.push(i);
            } else if (ch == ')') {
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } else if (!asteriskStack.isEmpty()) {
                    asteriskStack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!openStack.isEmpty()) {
            if (asteriskStack.isEmpty() || openStack.pop() > asteriskStack.pop()) {
                return false;
            }
        }

        return true;
    }
}
