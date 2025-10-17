

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String rowAndColumn = bufferedReader.readLine();
        String[] s = rowAndColumn.split(" ");
        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String rowValue = bufferedReader.readLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = rowValue.charAt(j);
            }
        }
        int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]!='.'){
                    if(isDanger(grid,n,m,i,j)){
                        if(isExisted(grid,n,m,i,j)){
                            cnt++;
                        }
                        if(!isExisted(grid,n,m,i,j)){
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);

    }

    private static boolean isDanger(char [][]grid, int n, int m,int i, int j) {
        char c=grid[i][j];
        switch (c){
            case 'L':
                for(int k=j-1;k>=0;k--){
                    if(grid[i][k]!='.'){//存在箭头 不危险
                        return false;
                    }
                }
                break;
            case 'R':
                for(int k=j+1;k<m;k++){
                    if(grid[i][k]!='.'){//存在箭头 不危险
                        return false;
                    }
                }
                break;
            case 'U':
                for(int k=i-1;k>=0;k--){
                    if(grid[k][j]!='.'){//存在箭头 不危险
                        return false;
                    }
                }
                break;
            case 'D':
                for(int k=i+1;k<n;k++){
                    if(grid[k][j]!='.'){//存在箭头 不危险
                        return false;
                    }
                }
                break;
        }
        return true;
    }

    private static boolean isExisted(char [][]grid, int n, int m,int i, int j) {
        for(int k=j-1;k>=0;k--){
            if(grid[i][k]!='.'){//存在箭头 不危险
                return true;
            }
        }
        for(int k=j+1;k<m;k++){
            if(grid[i][k]!='.'){//存在箭头 不危险
                return true;
            }
        }
        for(int k=i-1;k>=0;k--){
            if(grid[k][j]!='.'){//存在箭头 不危险
                return true;
            }
        }
        for(int k=i+1;k<n;k++){
            if(grid[k][j]!='.'){//存在箭头 不危险
                return true;
            }
        }
        return false;
    }

}


