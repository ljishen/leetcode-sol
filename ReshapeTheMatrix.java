// Question: https://leetcode.com/problems/reshape-the-matrix/

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c > nums.length * nums[0].length) {
            return nums;
        }

        int[][] res = new int[r][c];

        int cr = 0;
        int cc = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[cr][cc] = nums[i][j];
                cc++;
                if (cc == c) {
                    cc = 0;
                    cr++;
                }
            }
        }

        return res;
    }
}
