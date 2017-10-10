// Question: https://leetcode.com/problems/generate-parentheses/

public class GenerateParentheses {
    private List<String> res;

    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();

        append("", 0, 0, n);
        return res;
    }

    private void append(String str, int open, int end, int n) {
        if (str.length() == n * 2) {
            res.add(str);
            return;
        }

        if (open < n) {
            append(str + "(", open + 1, end, n);
        }

        if (end < open) {
            append(str + ")", open, end + 1, n);
        }
    }
}
