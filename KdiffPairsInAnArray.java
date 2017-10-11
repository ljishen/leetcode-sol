// Question: https://leetcode.com/problems/k-diff-pairs-in-an-array/

public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0;
        int j = 1;

        int count = 0;
        while (j < nums.length) {
            if (nums[j] - nums[i] == k) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    count++;
                }
                i++;
                j++;
            } else if (nums[j] - nums[i] < k) {
                j++;
            } else {
                i++;
                if (j == i) {
                    j++;
                }
            }
        }

        return count;
    }
}
