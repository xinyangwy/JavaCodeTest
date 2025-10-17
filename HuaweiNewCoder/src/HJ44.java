import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]grid=new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j]=sc.nextInt();
            }
        }
        fill(grid);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }


    private static boolean fill(int[][] grid) {
        //「一个for循环遍历棋盘的行，一个for循环遍历棋盘的列，
        // 一行一列确定下来之后，递归遍历这个位置放9个数字的可能性！」
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(grid[i][j]!=0){
                    continue;
                }
                for (int k = 1; k <= 9; k++) {  // (i, j) 这个位置放k是否合适
                    if(isVaild(grid,i,j,k)){//如果k符合不重复的条件，这个地方才可以放k
                        grid[i][j]=k;
                        //局部考虑这个地方才可以放k，但是全局考虑这地方可能放k之后导致其他地方放不了
                        if(fill(grid)){
                            return true;  //  如果这个地方可以放k  而且放k之后其他地方也可以正确的放置，那么就决确定放k了
                        }
                        grid[i][j]=0;// //  如果这个地方可以放k ，但是放k之后其他地方就放置失败了，那么就撤销放k，还原为0 （尝试放其他的数）
                    }
                }
                return false;
            }
        }
        return true;
    }

    private static boolean isVaild(int[][] grid, int i, int j, int k) {
        //行
        for (int y = 0; y < 9; y++) {
            if(grid[i][y]==k){
                return false;
            }
        }
        //列
        for (int x = 0; x < 9; x++) {
            if(grid[x][j]==k){
                return false;
            }
        }
        //3x3小方格
        int startX=(i/3)*3;
        int startY=(j/3)*3;
        for (int i1 = startX; i1 < startX+3; i1++) {
            for (int j1 = startY; j1 < startY+3; j1++) {
                if(grid[i1][j1]==k){
                    return false;
                }
            }
        }
        return true;
    }

}
