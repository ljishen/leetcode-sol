// Question: https://leetcode.com/problems/find-peak-element/description/

public class FindPeakElement {
  public int findPeakElement(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }

    return helper(nums, 0, nums.length - 1);
  }

  private int helper(int[] nums, int left, int right) {
    int mid = (left + right) / 2;

    if (mid == 0 && nums[mid] >= nums[mid + 1]
        || mid == nums.length - 1 && nums[mid] >= nums[mid - 1]
        || nums[mid] >= nums[mid + 1] && nums[mid] >= nums[mid - 1]) {
      return mid;
    } else {
      if (nums[mid] < nums[mid + 1]) {
        return helper(nums, mid + 1, right);
      } else {
        return helper(nums, left, mid - 1);
      }
    }
  }
}
