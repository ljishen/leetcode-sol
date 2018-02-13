// Question: https://leetcode.com/problems/longest-palindromic-substring/

public class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
    if (s == null || s.length() == 0) {
      return "";
    }

    int bestHead = 0;
    int bestTail = 0;

    int mid = 0;
    int head = 0;
    int tail = 0;
    boolean same = true;

    char[] cs = s.toCharArray();

    while (mid < cs.length) {
      head++;
      if (head < cs.length && cs[head - 1] == cs[head] && same) {
        continue;
      }

      tail--;
      if (head < cs.length && tail >= 0 && cs[head] == cs[tail]) {
        same = false;
        continue;
      }

      if (head - tail - 1 > bestHead - bestTail) {
        bestHead = head;
        bestTail = tail + 1;
      }

      mid++;
      head = mid;
      tail = mid;
      same = true;
    }

    return s.substring(bestTail, bestHead);
  }
}
