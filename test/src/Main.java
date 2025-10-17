import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String rowAndColumn = bufferedReader.readLine();
        String[] s = rowAndColumn.split(" ");
        int row = Integer.parseInt(s[0]), column = Integer.parseInt(s[1]);
        char[][] matrix = new char[row][column];
        for (int i = 0; i < row; i++) {
            String rowValue = bufferedReader.readLine();
            for (int j = 0; j < column; j++) {
                matrix[i][j] = rowValue.charAt(j);
            }
        }
        System.out.println(keepFoxSafe(matrix, row, column));
    }

    public static int keepFoxSafe(char[][] matrix, int row, int column){
        int modifyCount = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                char currentValue = matrix[i][j];
                boolean temp = false;
                if (currentValue == '.') {
                    continue;
                }
                switch (currentValue) {
                    case 'U':
                        temp = isExistDirection(matrix, 0, i - 1, i, j, false);
                        break;
                    case 'D':
                        temp = isExistDirection(matrix, i + 1, row - 1, i, j, false);
                        break;
                    case 'L':
                        temp = isExistDirection(matrix, 0, j - 1, i, j, true);
                        break;
                    case 'R':
                        temp = isExistDirection(matrix, j + 1, column - 1, i, j, true);
                        break;
                }
                if (!temp) {
                    char exist = rotateDirection(matrix, i, j);
                    if (exist == '.')
                        return -1;
                    if (exist != currentValue) {
                        matrix[i][j] = exist;
                        modifyCount++;
                    }
                }
            }
        }
        return modifyCount;
    }

    //判断四个方向有无箭头
    public static boolean isExistDirection(char[][] matrix, int startIndex, int endIndex, int currentRow, int currentColumn, boolean isRow){
        for (int i = startIndex; i <= endIndex && i >= 0; i++) {
            if (isRow && matrix[currentRow][i] != '.')
                return true;
            if (!isRow && matrix[i][currentColumn] != '.')
                return true;
        }
        return false;
    }

    public static char rotateDirection(char[][] matrix, int currentRow, int currentColumn){
        for (int i = 0; i < matrix.length; i++) {
            if (i == currentRow)
                continue;
            if (matrix[i][currentColumn] != '.') {
                if (i < currentRow)
                    return 'U';
                else return 'D';
            }
        }

        for (int j = 0; j < matrix[0].length; j++){
            if (j == currentColumn)
                continue;
            if (matrix[currentRow][j] != '.') {
                if (j < currentColumn)
                    return 'L';
                else return 'R';
            }
        }
        return '.';
    }
}