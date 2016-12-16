// Question: https://leetcode.com/problems/permutation-sequence/

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];

        StringBuilder sb = new StringBuilder();

        int idx = 0;
        int curN = n;
        while (curN > 0) {
            int inc = 1;
            int f = factorial(curN - 1);
            while (k > idx + f) {
                idx += f;
                inc++;
            }

            int numsIdx = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    numsIdx++;
                }

                if (numsIdx == inc) {
                    sb.append(i + 1);
                    nums[i] = 1;
                    break;
                }
            }
            curN--;
        }
        return sb.toString();
    }

    private int factorial(int m) {
        if (m == 0) {
            return 1;
        }

        int res = m;
        int cr = m - 1;
        while (cr > 1) {
            res *= cr;
            cr -= 1;
        }
        return res;
    }
}
