// Question: https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {
  public boolean isValid(String s) {
    char[] stack = new char[s.length() / 2 + 1];
    int end = -1;

    char[] cs = s.toCharArray();
    for (char c : cs) {
      if (end >= 0 && stack[end] == c) {
        end--;
        continue;
      }

      end++;
      if (end == stack.length) {
        return false;
      }

      if (c == '[') {
        stack[end] = ']';
      } else if (c == '{') {
        stack[end] = '}';
      } else if (c == '(') {
        stack[end] = ')';
      } else {
        return false;
      }
    }

    return end == -1;
  }
}
