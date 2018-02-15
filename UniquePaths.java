// Question: https://leetcode.com/problems/unique-paths/description/

public class UniquePaths {
  public int uniquePaths(int m, int n) {
    if (m == 1 || n == 1) {

      return 1;
    }

    int[][] map = new int[m][n];
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        map[i][j] = (i - 1 == 0 ? 1 : map[i - 1][j]) + (j - 1 == 0 ? 1 : map[i][j - 1]);
      }
    }
    return map[m - 1][n - 1];
  }
}
