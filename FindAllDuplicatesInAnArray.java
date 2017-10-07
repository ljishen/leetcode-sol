// Question: https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] *= -1;
            } else {
                res.add(idx + 1);
            }
        }

        return res;
    }
}
