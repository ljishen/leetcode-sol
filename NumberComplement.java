// Question: https://leetcode.com/problems/number-complement/

public class NumberComplement {
    public int findComplement(int num) {
        int bitLength = 32 - Integer.numberOfLeadingZeros(num);
        int ones = 1;
        for (int i = 0; i < bitLength - 1; i++) {
            ones = (ones << 1) + 1;
        }
        return num ^ ones;
    }
}
