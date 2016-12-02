// Question: https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        List<Integer> digits = new ArrayList<>();

        int cur = x;
        while (cur != 0) {
            digits.add(cur % 10);
            cur = cur / 10;
        }

        int newX = 0;
        for (int d : digits) {
            newX = newX * 10 + d;
        }

        return x == newX;
    }
}
