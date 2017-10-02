// Question: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;

        while (head < tail) {
            int sum = numbers[head] + numbers[tail];
            if (target == sum) {
                return new int[] {head + 1, tail + 1};
            }

            if (sum > target) {
                tail--;
            } else {
                head++;
            }
        }

        return null;
    }
}
