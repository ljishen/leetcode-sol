// Question: https://leetcode.com/problems/two-sum

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToPos = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            Integer pos = numToPos.get(target - nums[i]);
            if (pos != null) {
                return new int[]{i, pos};
            }
            numToPos.put(nums[i], i);
        }

        return null;
    }
}
