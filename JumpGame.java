// Question: https://leetcode.com/problems/jump-game/description/

public class JumpGame {
  public boolean canJump(int[] nums) {
    int fastest = 0;
    for (int i = 0; i < nums.length; i++) {
      if (fastest < i) {
        return false;
      }
      fastest = Math.max(nums[i] + i, fastest);
    }
    return true;
  }
}
