// Question: https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int curLen = 0;
        for (int i : nums) {
            if (i == 1) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen);
                curLen = 0;
            }
        }
        return Math.max(maxLen, curLen);
    }
}
