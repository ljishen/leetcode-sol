// Question: https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        Map<Integer, Integer> numberToCount = new HashMap<>();
        for (int n : nums1) {
            Integer count = numberToCount.get(n);
            if (count == null) {
                count = 0;
            }
            numberToCount.put(n, ++count);
        }

        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            Integer count = numberToCount.get(n);
            if (count != null && count > 0) {
                list.add(n);
                numberToCount.put(n, --count);
            }
        }

        int[] res = new int[list.size()];
        int i = 0;
        for (int n : list) {
            res[i] = n;
            i++;
        }

        return res;
    }
}
