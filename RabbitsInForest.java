// Question: https://leetcode.com/contest/weekly-contest-71/problems/rabbits-in-forest/

public class RabbitsInForest {
  public int numRabbits(int[] answers) {
    int res = 0;

    Map<Integer, Integer> s = new HashMap<Integer, Integer>();
    for (int i : answers) {
      Integer remain = s.get(i);
      if (remain == null) {
        res += i + 1;
        remain = i;
      } else {
        remain--;
      }

      if (remain == 0) {
        s.remove(i);
      } else {
        s.put(i, remain);
      }
    }
    return res;
  }
}
