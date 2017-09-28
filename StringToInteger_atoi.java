// Question: https://leetcode.com/problems/string-to-integer-atoi/

public class StringToInteger_atoi {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        char c;
        int i = -1;
        do {
            i++;
            c = str.charAt(i);
        } while (c == ' ' && i < str.length());

        if (c == ' ') {
            return 0;
        }

        boolean neg = false;
        if (c == '-') {
            neg = true;
            i++;
        }

        if (c == '+') {
            i++;
        }

        long res = 0;
        for (int p = i; p < str.length(); p++) {
            c = str.charAt(p);
            if (c > '9' || c < '0') {
                break;
            }

            res = res * 10 + (c - '0');

            if (!neg && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (neg && -1 * res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) res * (neg ? -1 : 1);
    }
}
