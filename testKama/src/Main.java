

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static int[][] dirs = { {-1, 0}, {0, -1}, {1, 0}, {0, 1} }; // 保存四个方向
    public static void dfs(int[][] grid, int n, int m,int x, int y) {
        grid[x][y] = 2;
        for (int[] d : dirs) {
            int nextX = x + d[0];
            int nextY = y + d[1];
            // 超过边界
            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) continue;
            // 不符合条件，不继续遍历
            if (grid[nextX][nextY] == 0 || grid[nextX][nextY] == 2) continue;
            dfs(grid, n,m,nextX, nextY);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
//        sc.nextLine();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j]=sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            if(grid[0][j]==1)dfs(grid,n,m,0,j);
            if(grid[n-1][j]==1)dfs(grid,n,m,n-1,j);
        }
        for (int i = 0; i < n; i++) {
            if(grid[i][0]==1)dfs(grid,n,m,i,0);
            if(grid[i][m-1]==1)dfs(grid,n,m,i,m-1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==1)grid[i][j]=0;
                if(grid[i][j]==2)grid[i][j]=1;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
