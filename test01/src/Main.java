import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    class Solution {
        public static int [][]dirs=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        public int orangesRotting(int[][] grid) {
            int  m=grid.length;
            int  n=grid[0].length;
            int cnt=0;
            Queue<int[]> q=new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(grid[i][j]==1){
                        cnt++;
                    } else if (grid[i][j] == 2) {
                        q.add(new int[]{i,j});
                    }
                }
            }

            int minutes=0;
            while (cnt>0 && !q.isEmpty()){
                minutes++;
                //层序遍历 把新鲜的变为腐烂的
                int s=q.size();
                for (int k = 0; k < s; k++) {
                    int []orange=q.poll();
                    int i=orange[0];
                    int j=orange[1];
                    for (int[] dir : dirs) {
                        int x=i+dir[0];
                        int y=j+dir[1];
                        if(x>=0 && x<m && y>=0 &&y<n && grid[x][y]==1){
                            grid[x][y]=2;
                            cnt--;
                            q.add(new int[]{x,y});
                        }
                    }
                }
            }
            return cnt>0?-1:minutes;
        }
    }
}


