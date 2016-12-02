// Question: https://leetcode.com/problems/remove-element/

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }

        int tail = nums.length - 1;
        while (tail >= 0 && nums[tail] == val) {
            tail--;
        }

        int head = 0;
        while (tail >= head) {
            if (nums[head] == val) {
                swap(nums, head, tail);
                tail--;
            } else {
                head++;
            }
        }
        return tail + 1;
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
