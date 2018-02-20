// Question: https://leetcode.com/problems/number-of-islands/description/

public class NumberOfIslands {
  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int count = 0;

    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
        if (grid[row][col] == '1') {
          count++;
          searchSurrounding(grid, row, col);
        }
      }
    }

    return count;
  }

  private void searchSurrounding(char[][] grid, int row, int col) {
    if (row < 0
        || col < 0
        || row >= grid.length
        || col >= grid[0].length
        || grid[row][col] == '0') {
      return;
    }

    grid[row][col] = '0';

    searchSurrounding(grid, row - 1, col);
    searchSurrounding(grid, row + 1, col);
    searchSurrounding(grid, row, col - 1);
    searchSurrounding(grid, row, col + 1);
  }
}
