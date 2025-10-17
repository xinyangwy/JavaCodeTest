import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p0625_3 {
    static int m;
    static int n;
    static int[][] grids;
    static int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1},{-1,-1},{-1,1},{1,-1},{1,1}};

    public static void main(String[] args) {
        //计算岛屿数量   cn2
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        grids = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grids[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grids[i][j] == 1) {
                    bfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt*(cnt-1)/2);
    }

    private static void dfs(int i, int j) {
        grids[i][j]=0;
        for (int[] dir : dirs) {
            int x = i+dir[0];
            int y = j+dir[1];
            if (x >= 0 && x < m && y >= 0 && y < n && grids[x][y] == 1) {
                dfs(x,y);
            }
        }
    }

    private static void bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            i = cur[0];
            j = cur[1];//每次while循环里面 i 和 j都要更新
            grids[i][j] = 0;
            for (int[] dir : dirs) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (0 <= i && i < m && 0 <= j && j < n && grids[i][j] == 1) {
                    grids[i][j] = 0;
                    q.add(new int[]{x, y});
                }
            }
        }
    }
}
