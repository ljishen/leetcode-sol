// Question: https://leetcode.com/problems/reverse-string/

public class ReverseString {
    public String reverseString(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = s.length() - 1;

        char[] cs = s.toCharArray();
        while (start < end) {
            char tmp = cs[start];
            cs[start] = cs[end];
            cs[end] = tmp;

            start++;
            end--;
        }

        return new String(cs);
    }
}
