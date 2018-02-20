// Question: https://leetcode.com/problems/house-robber/description/

public class HouseRobber {
  public int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int[] robbed = new int[nums.length];
    robbed[0] = nums[0];

    if (nums.length == 1) {
      return robbed[0];
    } else {
      robbed[1] = Math.max(nums[0], nums[1]);
      if (nums.length == 2) {
        return robbed[1];
      }
    }

    for (int i = 2; i < nums.length; i++) {
      robbed[i] = Math.max(robbed[i - 1], robbed[i - 2] + nums[i]);
    }

    return robbed[nums.length - 1];
  }
}
