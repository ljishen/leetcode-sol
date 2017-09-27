// Question: https://leetcode.com/problems/find-k-closest-elements

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int location = findLocation(arr, x);

        int left = location - 1 >= 0 ? location - 1 : -1;
        int right = location;

        int count = 0;
        while (count < k) {
            count++;
            if (left >= 0 && right < arr.length) {
                if (x - arr[left] <= arr[right] - x) {
                    left--;
                } else {
                    right++;
                }
            } else if (left >= 0) {
                left--;
            } else {
                right++;
            }
        }

        List<Integer> res = new ArrayList<>(k);
        for (int i = 1; i <= k; i++) {
            res.add(arr[i + left]);
        }
        return res;
    }

    private int findLocation(int[] arr, int x) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
