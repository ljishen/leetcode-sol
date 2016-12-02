// Question: https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] orderedNum = new int[nums.length];

        int id = 0;
        for (int n : nums) {
            if (n != 0) {
                orderedNum[id] = n;
                id++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = orderedNum[i];
        }
    }
}
