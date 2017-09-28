// Question: https://leetcode.com/problems/repeated-substring-pattern/

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int sLen = s.length();
        int halfLen = sLen / 2;

        for (int index = 0; index < halfLen; index++) {
            int len = index + 1;
            if (sLen % len != 0) {
                continue;
            }

            String core = s.substring(0, len);
            int j = len;
            while (j < sLen && core.equals(s.substring(j, j + len))) {
                j += len;
            }

            if (j == sLen) {
                return true;
            }
        }

        return false;
    }
}
