// Question: https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> cMap = new HashMap<>();
        cMap.put(')', '(');
        cMap.put(']', '[');
        cMap.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);

            if (st.empty()) {
                st.push(n);
                continue;
            }

            Character c = cMap.get(n);
            if (c == null) {
                st.push(n);
            } else if (st.pop() != c) {
                return false;
            }
        }

        return st.empty();
    }
}
