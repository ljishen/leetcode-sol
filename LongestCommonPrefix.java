// Question: https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    int endCommPos = -1;
    boolean run = true;
    while (run) {
      int nextPos = endCommPos + 1;
      Character c = null;
      for (String s : strs) {
        if (nextPos == s.length()) {
          run = false;
          break;
        }

        if (c == null) {
          c = s.charAt(nextPos);
        } else if (c != s.charAt(nextPos)) {
          run = false;
          break;
        }
      }
      endCommPos = nextPos;
    }

    return strs[0].substring(0, endCommPos);
  }
}
