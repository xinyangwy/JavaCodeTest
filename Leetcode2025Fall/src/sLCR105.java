/**
 * @Auther: WuZilong
 * @Date: 2025/10/21 23:18
 * @Description:
 */
public class sLCR105 {
    private static int[][] dirs = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(grid, i, j));
                }
            }
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j) {
        grid[i][j]=0;
        int cnt = 1;
        for (int[] dir : dirs) {
            int x = dir[0];
            int y = dir[1];
            if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1) {
                cnt += dfs(grid,x,y);
            }
        }
        return cnt;
    }
}
