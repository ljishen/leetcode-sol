// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedSortedArray {
  public int search(int[] nums, int target) {
    if (nums == null) {
      return -1;
    }

    if (nums.length == 1) {
      return nums[0] == target ? 0 : -1;
    }

    int start = 0;
    int end = nums.length - 1;

    while (start < end) {
      if (nums[start] == target) {
        return start;
      }

      if (nums[end] == target) {
        return end;
      }

      int mid = (start + end) / 2;
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[start] < nums[mid]) {
        if (target > nums[start] && target < nums[mid]) {
          end = mid;
        } else {
          start = mid;
        }
      } else {
        if (target < nums[start] && target > nums[mid]) {
          start = mid;
        } else {
          end = mid;
        }
      }
    }

    return -1;
  }
}
