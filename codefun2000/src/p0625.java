import java.io.*;
import java.util.*;

public class p0625 {
    static int m;
    static int n;
    static int [][]dirs=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    static int [][]grids,dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        grids=new int[m][n];
        dp=new int[m][n];//dp[i][j] 存储从格子 (i, j) 出发能滑行的最长路径长度。

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grids[i][j]=sc.nextInt();
            }
        }
        int res=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res=Math.max(res,dfs(i,j));
            }
        }
        System.out.println(res);
    }

    private static int dfs(int i, int j) {
        if(dp[i][j]!=0){
            return dp[i][j]; // 如果已计算过，直接返回
        }
        int maxLen=1; // 至少包含自己
        for (int[] dir : dirs) {
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && x<m && y>=0 && y<n && grids[x][y]<grids[i][j]){
                maxLen=Math.max(maxLen,1+dfs(x,y));
            }
        }
        dp[i][j]=maxLen;
        return maxLen;
    }

}
