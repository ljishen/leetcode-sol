// Question: https://leetcode.com/problems/power-of-four/

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        return (Math.log(num) / Math.log(4)) % 1 == 0;
    }
}
