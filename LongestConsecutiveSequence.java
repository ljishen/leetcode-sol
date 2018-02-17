// Question: https://leetcode.com/problems/longest-consecutive-sequence/description/

public class LongestConsecutiveSequence {
  public int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    Set<Integer> hash = new HashSet<>();
    for (int i : nums) {
      hash.add(i);
    }

    int len = 1;
    for (int i : nums) {
      if (!hash.contains(i - 1)) {
        int count = 1;

        while (hash.contains(i + count)) {
          count++;
        }

        len = Math.max(len, count);
      }
    }

    return len;
  }
}
