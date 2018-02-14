// Question: https://leetcode.com/problems/count-and-say/description/

public class CountAndSay {
  public String countAndSay(int n) {
    StringBuilder sb = new StringBuilder("1");

    int count = 0;
    int idx = n;

    while (idx > 1) {
      StringBuilder gen = new StringBuilder();

      char cur = ' ';
      for (int i = 0; i < sb.length(); i++) {
        char c = sb.charAt(i);
        if (c == cur) {
          count++;
          continue;
        }

        if (cur != ' ') {
          gen.append(count).append(cur);
        }

        cur = c;
        count = 1;
      }

      gen.append(count).append(cur);

      sb = gen;
      idx--;
    }

    return sb.toString();
  }
}
