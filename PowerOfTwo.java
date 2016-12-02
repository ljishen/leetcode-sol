// Question: https://leetcode.com/problems/power-of-two/

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        } else {
            return Integer.bitCount(n) == 1;
        }
    }
}
