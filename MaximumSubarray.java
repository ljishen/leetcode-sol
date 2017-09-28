// Question: https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sumCurrent = nums[0];
        int sumMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sumCurrent = Math.max(sumCurrent + nums[i], nums[i]);
            sumMax = Math.max(sumCurrent, sumMax);
        }
        return sumMax;
    }
}
