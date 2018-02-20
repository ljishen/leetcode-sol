// Question: https://leetcode.com/problems/maximum-product-subarray/description/

public class MaximumProductSubarray {
  public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int maxSoFar = nums[0];
    int maxEndHere = nums[0];
    int minEndHere = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int tMaxEndHere = maxEndHere;
      maxEndHere = Math.max(Math.max(maxEndHere * nums[i], minEndHere * nums[i]), nums[i]);
      minEndHere = Math.min(Math.min(minEndHere * nums[i], tMaxEndHere * nums[i]), nums[i]);
      maxSoFar = Math.max(maxSoFar, maxEndHere);
    }

    return maxSoFar;
  }
}
