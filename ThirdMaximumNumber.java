// Question: https://leetcode.com/problems/third-maximum-number/

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int firstMax = nums[0];
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (firstMax < nums[i]) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (secondMax < nums[i] && nums[i] < firstMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (thirdMax < nums[i] && nums[i] < secondMax) {
                thirdMax = nums[i];
            }
        }

        if (firstMax > secondMax &&
                secondMax > thirdMax &&
                secondMax != Long.MIN_VALUE &&
                thirdMax != Long.MIN_VALUE) {
            return (int) thirdMax;
        } else {
            return firstMax;
        }
    }
}
