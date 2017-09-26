// Question: https://leetcode.com/problems/maximum-size-subarray-sum-equals-k

public class MaximumSizeSubarraySumEqualsK {
  public int maxSubArrayLen(int[] nums, int k) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    Map<Integer, Integer> sumToIndex = new HashMap<>();
    sumToIndex.put(0, -1); // in case the maximum subarray starts from index 0

    int sum = 0;
    int maxSize = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (!sumToIndex.contains(sum)) {
        sumToIndex.put(sum, i);
      }

      Integer prev = sumToIndex.get(sum - k);
      if (prev != null) {
        maxSize = Math.max(maxSize, i - prev);
      }
    }

    return maxSize;
  }
}
