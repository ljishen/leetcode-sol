// Question: https://leetcode.com/problems/spiral-matrix/description/

public class SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<>();

    if (matrix == null) {
      return res;
    }

    int top = 0;
    int bottom = matrix.length;

    if (bottom == 0) {
      return res;
    }

    int left = 0;
    int right = matrix[0].length;

    while (left < right && top < bottom) {
      for (int i = left; i < right; i++) {
        res.add(matrix[top][i]);
      }
      top++;
      for (int i = top; i < bottom; i++) {
        res.add(matrix[i][right - 1]);
      }
      right--;

      if (top == bottom) {
        break;
      }

      for (int i = right - 1; i >= left; i--) {
        res.add(matrix[bottom - 1][i]);
      }
      bottom--;

      if (left == right) {
        break;
      }

      for (int i = bottom - 1; i >= top; i--) {
        res.add(matrix[i][left]);
      }
      left++;
    }

    return res;
  }
}
