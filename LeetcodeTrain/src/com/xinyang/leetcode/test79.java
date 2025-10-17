package com.xinyang.leetcode;

public class test79 {
}

class Solution {
    int dirs[][] = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(char[][] board, String word, int i, int j, int k) {
        if (board[i][j] != word.charAt(k)) {
            return false;
        }
        if (k == word.length()) {
            return true;
        }
        board[i][j] = 0;
        for (int[] d : dirs) {
            int x = i + d[0];
            int y = j + d[1]; // 相邻格子
            if (0 <= x && x < board.length && 0 <= y && y < board[x].length && dfs(board, word, x, y, k + 1)) {
                return true; // 搜到了！
            }
        }
        board[i][j] = word.charAt(k);
        return false;
    }
}