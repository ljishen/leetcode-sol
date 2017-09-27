// Question: https://leetcode.com/problems/search-insert-position

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        int res = 0;
        while (true) {
            if (left == nums.length) {
                res = nums.length;
                break;
            }

            if (right == 0) {
                break;
            }

            if (left == right) {
                res = nums[right] > target ? right : right + 1;
                break;
            }

            int midIdx = (left + right) / 2;
            if (nums[midIdx] == target) {
                res = midIdx;
                break;
            }

            if (nums[midIdx] > target) {
                right = midIdx;
            } else {
                left = midIdx + 1;
            }
        };

        return res;
    }
}
