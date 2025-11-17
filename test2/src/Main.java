import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] grid = new int[n][m];
        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
                total += grid[i][j];
            }
        }

        //前缀和   lines
        int[] lines = new int[n];
        int[] line = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                line[i] += grid[i][j];
            }
        }
        lines[0] = line[0];
        for (int i = 1; i < n; i++) {
            lines[i] = lines[i - 1] + line[i];
        }
        //前缀和  rows
        int[] rows = new int[m];
        int[] row = new int[m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                row[j] += grid[i][j];
            }
        }
        rows[0] = row[0];
        for (int j = 1; j < m; j++) {
            rows[j] = rows[j - 1] + row[j];
        }

        int min=Integer.MAX_VALUE;
        //行分界  遍历
        for (int i = 0; i < n - 1; i++) {//n行之后分界
            min = Math.min(min, Math.abs(lines[i] * 2 - total));
        }
        //列分界  遍历
        for (int j = 0; j < m - 1; j++) {//m列之后分界
            min = Math.min(min, Math.abs(rows[j] * 2 - total));
        }
        System.out.println(min);
    }
}