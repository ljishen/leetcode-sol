// Question: https://leetcode.com/problems/repeated-string-match/

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < B.length() + A.length()) {
            sb.append(A);
            count++;

            if (sb.length() >= B.length() && sb.indexOf(B) != -1) {
                return count;
            }
        }

        return -1;
    }
}
