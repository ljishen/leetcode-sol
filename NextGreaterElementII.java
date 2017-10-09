// Question: https://leetcode.com/problems/next-greater-element-ii/

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int[] res = new int[nums.length];
        Arrays.fill(res, -1);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length * 2; i++) {
            int n = nums[i % nums.length];
            while (!st.isEmpty() && nums[st.peek()] < n) {
                res[st.pop()] = n;
            }

            if (i < nums.length) {
                st.push(i);
            }
        }

        return res;
    }
}
