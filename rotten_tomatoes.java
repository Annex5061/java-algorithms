public static boolean isSafe(int[][] grid, int i, int j) {
  int n = grid.length;
  int m = grid[0].length;
  return (i >= 0 && j >= 0 && i < n && j < m);
}
public static int numberOfDays(int[][] grid) {
  int days = 2;
  boolean flag = false;
  int n = grid.length;
  int m = grid[0].length;
  while (true) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (grid[i][j] == days) {
          if (isSafe(grid, i + 1, j) && grid[i + 1][j] == 1) {
            grid[i + 1][j] = grid[i][j] + 1;
            flag = true;
          }
          if (isSafe(grid, i, j + 1) && grid[i][j + 1] == 1) {
            grid[i][j + 1] = grid[i][j] + 1;
            flag = true;
          }
          if (isSafe(grid, i - 1, j) && grid[i - 1][j] == 1) {
            grid[i - 1][j] = grid[i][j] + 1;
            flag = true;
          }
          if (isSafe(grid, i, j - 1) && grid[i][j - 1] == 1) {
            grid[i][j - 1] = grid[i][j] + 1;
            flag = true;
          }
        }
      }
    }
    if (flag == false) {
      break;
    }
    flag = false;
    days++;
  }
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      if (grid[i][j] == 1) {
        days = -1;
      }
    }
  }
  return days == -1 ? days : days - 2;
}