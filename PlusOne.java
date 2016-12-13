// Question: https://leetcode.com/problems/plus-one/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] resDigits = new int[digits.length];
        System.arraycopy(digits, 0, resDigits, 0, digits.length);

        for (int i = resDigits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                resDigits[i]++;
                return resDigits;
            }

            resDigits[i] = 0;
        }

        int[] resExt = new int[resDigits.length + 1];
        resExt[0] = 1;
        return resExt;
    }
}
