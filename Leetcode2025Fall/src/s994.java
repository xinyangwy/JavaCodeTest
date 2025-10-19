import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Auther: WuZilong
 * @Date: 2025/10/19 23:16
 * @Description:
 */
public class s994 {
    private static int[][] dirs = new int[][] { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
            }
        }

        int minutes = 0;
        while (count > 0 && !q.isEmpty()) {
            minutes++;
            int s = q.size();
            for (int k = 0; k < s; k++) {
                int[] orange = q.poll();
                int i = orange[0];
                int j = orange[1];
                for (int[] dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                        grid[x][y] = 2;//腐烂的 四周变为腐烂的
                        q.add(new int[] { x, y });//新的腐烂的加入队列之中  在下面的while循环里面用于影响别的新鲜的橘子
                        count--;//新鲜的 标识为1的橘子数量减1

                    }
                }
            }
        }

        return count > 0 ? -1 : minutes;
    }
}
