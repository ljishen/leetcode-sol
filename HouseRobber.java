// Question: https://leetcode.com/problems/house-robber/

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] moneys = new int[nums.length];

        if (nums.length >= 1) {
            moneys[0] = nums[0];
        }

        if (nums.length >= 2) {
            moneys[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        }

        if (nums.length >= 3) {
            int sum = nums[0] + nums[2];
            moneys[2] = sum > nums[1] ? sum : nums[1];
        }

        for (int i = 3; i < nums.length; i++) {
            int sum = moneys[i - 2] + nums[i];
            moneys[i] = sum > moneys[i - 1] ? sum : moneys[i - 1];
        }

        return moneys[nums.length - 1];
    }
}
