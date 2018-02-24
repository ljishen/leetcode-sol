// Question: https://leetcode.com/problems/house-robber-ii/description/

public class HouseRobberII {
  public int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    int[] robbed = new int[nums.length - 1];

    robbed[0] = nums[1];
    int res1 = compute(nums, robbed, 2);

    robbed[0] = nums[0];
    int res2 = compute(nums, robbed, 1);

    return Math.max(res1, res2);
  }

  private int compute(int[] nums, int[] robbed, int idx) {
    for (int i = 1; i < robbed.length; i++) {
      robbed[i] = Math.max(robbed[i - 1], (i - 2 >= 0 ? robbed[i - 2] : 0) + nums[idx++]);
    }
    return robbed[robbed.length - 1];
  }
}
