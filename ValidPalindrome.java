// Question: https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }

        String clean = s.replaceAll("\\W", "");

        int length = clean.length();
        for (int i = 0; i < length / 2; i++) {
            char charLeft = clean.charAt(i);
            char charRight = clean.charAt(length - 1 - i);

            if (charLeft == charRight) {
                continue;
            }

            if ((charLeft >= '0' && charLeft <= '9') || (charRight >= '0' && charRight <= '9')) {
                return false;
            }

            if (charLeft >= 'a' && charLeft <= 'z' && charLeft - 32 != charRight) {
                return false;
            } else if (charLeft >= 'A' && charLeft <= 'Z' && charLeft + 32 != charRight) {
                return false;
            }
        }

        return true;
    }
}
