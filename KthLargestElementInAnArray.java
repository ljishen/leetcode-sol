//Question: https://leetcode.com/problems/kth-largest-element-in-an-array/

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        int[] res = sort(nums, 0, nums.length, k);
        return res[res.length - 1];
    }

    /**
     * start: included
     * end: not included
     **/
    private int[] sort(int[] arr, int start, int end, int k) {
        if (end - start > 1) {
            int mid = (end - start) / 2 + start;
            int[] left = sort(arr, start, mid, k);
            int[] right = sort(arr, mid, end, k);

            return merge(left, right, k);
        } else {
            return new int[] { arr[start] };
        }
    }

    private int[] merge(int[] left, int[] right, int k) {
        int length = (int) Math.min(left.length + right.length, k);
        int[] res = new int[length];

        int pLeft = 0;
        int pRight = 0;
        int idx = 0;
        while (idx < length) {
            if (pLeft >= left.length ||
                    (pRight < right.length && left[pLeft] < right[pRight])) {
                res[idx] = right[pRight];
                pRight++;
            } else {
                res[idx] = left[pLeft];
                pLeft++;
            }
            idx++;
        }

        return res;
    }
}
