// Question: https://leetcode.com/problems/nth-digit/

public class NthDigit {
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }

        int base = 9;
        long start = 1;
        int bits = 1;
        int seg = n;
        while (true) {
            long res = seg - base * start * bits;
            if (res < 0) {
                break;
            }

            seg = (int) res;
            start *= 10;
            bits++;
        }

        int num = (int) (start + Math.ceil(seg * 1.0 / bits) - 1);
        String s = Integer.toString(num);
        return Character.getNumericValue(s.charAt((seg - 1) % bits));
    }
}
