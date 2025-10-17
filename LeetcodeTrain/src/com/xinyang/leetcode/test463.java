package com.xinyang.leetcode;

public class test463 {
}


class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res += 4;
                    if (i != 0 && grid[i - 1][j] == 1 && !visited[i - 1][j]) {
                        visited[i - 1][j] = true;
                        res--;
                    }
                    if (j != 0 && grid[i][j - 1] == 1 && !visited[i][j - 1]) {
                        visited[i][j - 1] = true;
                        res--;
                    }
                    if (i != grid.length - 1 && grid[i + 1][j] == 1 && !visited[i + 1][j]) {
                        visited[i + 1][j] = true;
                        res--;
                    }
                    if (j != grid[0].length - 1 && grid[i][j + 1] == 1 && !visited[i][j + 1] && !visited[i][j + 1]) {
                        visited[i][j + 1] = true;
                        res--;
                    }
                }
            }
        }
        return res;
    }
}
