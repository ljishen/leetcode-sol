// Question: https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 1;
        for (int i = 1; i < s.length(); i++) {
            int oddOffset = 1;
            while (i - oddOffset >= 0
                    && i + oddOffset < s.length()
                    && s.charAt(i + oddOffset) == s.charAt(i - oddOffset)) {
                oddOffset++;
            }

            int evenOffset = 1;
            while (i - evenOffset >= 0
                    && i + evenOffset - 1 < s.length()
                    && s.charAt(i + evenOffset - 1) == s.charAt(i - evenOffset)) {
                evenOffset++;
            }

            if (oddOffset == 1 && evenOffset == 1) {
                continue;
            }

            int offset = Math.max(evenOffset, oddOffset);

            int curStart = i - offset + 1;
            int curEnd = i + offset - (evenOffset > oddOffset ? 1 : 0);

            if (curEnd - curStart > end - start) {
                start = curStart;
                end = curEnd;
            }
        }

        return s.substring(start, end);
    }
}
