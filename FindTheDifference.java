// Question: https://leetcode.com/problems/find-the-difference/

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        if (sc.length == 0) {
            return tc[0];
        }

        char res = sc[0];
        for (int i = 1; i < sc.length; i++) {
            res ^= sc[i];
        }

        for (char c : tc) {
            res ^= c;
        }
        return res;
    }
}
