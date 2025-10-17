

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // 读取换行符
        char [][]grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
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
            if(grid[i][k]!='.'){
                return true;
            }
        }
        for(int k=j+1;k<m;k++){
            if(grid[i][k]!='.'){
                return true;
            }
        }
        for(int k=i-1;k>=0;k--){
            if(grid[k][j]!='.'){
                return true;
            }
        }
        for(int k=i+1;k<n;k++){
            if(grid[k][j]!='.'){
                return true;
            }
        }
        return false;
    }

}


