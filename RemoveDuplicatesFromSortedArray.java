// Question: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
         if (nums == null || nums.length == 0) {
             return 0;
         }

         int prev = 0;
         int next = 1;
         while (next < nums.length) {
             if (nums[next] > nums[prev]) {
                 prev++;
                 if (next > prev) {
                     swap(nums, next, prev);
                 }
             }
             next++;
         }
         return prev + 1;
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
