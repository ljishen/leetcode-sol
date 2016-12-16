// Question: https://leetcode.com/problems/contains-duplicate-ii/

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int head = 0;
        Set<Integer> cache = new HashSet<>();

        for (int n : nums) {
            if (cache.size() > k) {
                cache.remove(nums[head]);
                head++;
            }

            if (!cache.add(n)) {
                return true;
            }
        }
        return false;
    }
}
