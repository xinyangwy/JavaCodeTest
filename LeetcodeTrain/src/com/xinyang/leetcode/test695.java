package com.xinyang.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class test695 {
}

class Solution695 {
    public int numIslands(char[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    int tmp=bfs(grid, i, j);
                    maxArea=Math.max(maxArea,tmp);
                }
            }
        }
        return maxArea;
    }

    private int bfs(char grid[][], int i, int j) {
        int tmpArea=0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] cur = q.remove();
            i = cur[0]; j = cur[1];//每次while循环里面 i 和 j都要更新
            if (0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == '1') {
                tmpArea++;
                q.add(new int[]{i + 1, j});
                q.add(new int[]{i, j + 1});
                q.add(new int[]{i - 1, j});
                q.add(new int[]{i, j - 1});
            }
        }
        return tmpArea;
    }
}
