package com.xinyang.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class test200 {
}


class Solution200 {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void bfs(char grid[][], int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] cur = q.remove();
            i = cur[0]; j = cur[1];//每次while循环里面 i 和 j都要更新
            if (0 <= i && i < grid.length && 0 <= j && j < grid[0].length && grid[i][j] == '1') {
                grid[i][j] = '0';
                q.add(new int[]{i + 1, j});
                q.add(new int[]{i, j + 1});
                q.add(new int[]{i - 1, j});
                q.add(new int[]{i, j - 1});
            }
        }
    }

//    private void dfs(char[][] grid, int i, int j) {
//        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
//            return;
//        }
//        grid[i][j] = '1';
//        dfs(grid, i + 1, j);
//        dfs(grid, i, j + 1);
//        dfs(grid, i - 1, j);
//        dfs(grid, i, j - 1);
//    }
}

