// Question: https://leetcode.com/problems/intersection-of-two-arrays/

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        Set<Integer> nums1Set = new HashSet<>();
        for(int n : nums1) {
            nums1Set.add(n);
        }

        Set<Integer> intersection = new HashSet<>();

        for (int n : nums2) {
            if (nums1Set.contains(n)) {
                intersection.add(n);
            }
        }

        int[] res = new int[intersection.size()];
        int i = 0;
        for (int n : intersection) {
            res[i] = n;
            i++;
        }

        return res;
    }
}
