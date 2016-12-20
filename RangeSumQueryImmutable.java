// Question: https://leetcode.com/problems/range-sum-query-immutable/

public class RangeSumQueryImmutable {
    private int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        if (sums.length > 0) {
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[i] = sums[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sums[j];
        }

        return sums[j] - sums[i - 1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
