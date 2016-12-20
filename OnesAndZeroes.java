// Question: https://leetcode.com/problems/ones-and-zeroes/

public class OnesAndZeroes {
    public int findMaxForm(String[] strs, int m, int n) {
        if (strs == null) {
            return 0;
        }

        if (strs.length == 0) {
            return 0;
        }

        int[][] numZerosOnes = new int[strs.length + 1][2];
        for (int s = 0; s < strs.length; s++) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < strs[s].length(); i++) {
                if (strs[s].charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
            numZerosOnes[s + 1][0] = zeros;
            numZerosOnes[s + 1][1] = ones;
        }

        int[][][] opts = new int[strs.length + 1][m + 1][n + 1];
        for (int s = 0; s < strs.length + 1; s++) {
            for (int i = 0; i < m + 1; i++) {
                for (int j = 0; j < n + 1; j++) {
                    if (s == 0) {
                        opts[s][i][j] = 0;
                    } else if (numZerosOnes[s][0] > i || numZerosOnes[s][1] > j) {
                        opts[s][i][j] = opts[s - 1][i][j];
                    } else {
                        opts[s][i][j] = Math.max(opts[s - 1][i][j], opts[s - 1][i - numZerosOnes[s][0]][j - numZerosOnes[s][1]] + 1);
                    }
                }
            }
        }
        return opts[strs.length][m][n];
    }
}
