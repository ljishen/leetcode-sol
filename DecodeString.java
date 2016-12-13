// Question: https://leetcode.com/problems/decode-string/

public class DecodeString {
    private Stack<Integer> counts = new Stack<>();
    private int idx = 0;

    public String decodeString(String s) {
        return build(s, 0);
    }

    private String build(String s, int start) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while(idx < s.length()) {
            char c = s.charAt(idx);
            idx++;

            if (48 <= c && c <= 57) {
                count = count * 10 + (c - '0');
            } else if ('a' <= c && c <= 'z') {
                sb.append(c);
            } else if (c == '[') {
                counts.push(count);
                sb.append(build(s, idx));
                count = 0;
            } else {
                int times = counts.pop();
                String copy = sb.toString();
                while (times > 1) {
                    sb.append(copy);
                    times--;
                }
                return sb.toString();
            }
        }

        return sb.toString();
    }
}
