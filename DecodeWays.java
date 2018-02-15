// Question: https://leetcode.com/problems/decode-ways/description/

public class DecodeWays {
  public int numDecodings(String s) {
    if (s == null || s.length() == 0 || s.startsWith("0")) {
      return 0;
    }

    int[] ways = new int[s.length()];

    ways[0] = 1;
    for (int i = 1; i < ways.length; i++) {
      int prev = s.charAt(i - 1) - '0';
      int cur = s.charAt(i) - '0';

      if (cur == 0) {
        if (prev != 1 && prev != 2) {
          return 0;
        }

        if (i - 2 >= 0) {
          ways[i - 1] = ways[i - 2];
        }

        ways[i] = ways[i - 1];
        continue;
      } else if (prev == 0) {
        ways[i] = ways[i - 1];
        continue;
      }

      ways[i] = ways[i - 1];
      if (prev * 10 + cur <= 26) {
        ways[i] += (i - 2 >= 0 ? ways[i - 2] : 1);
      }
    }

    return ways[ways.length - 1];
  }
}
