class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();

                if (v == 0) {
                    v = 1;
                } else {
                    v = 2 * v;
                }

                stack.push(stack.pop() + v);
            }
        }

        return stack.pop();
    }
}