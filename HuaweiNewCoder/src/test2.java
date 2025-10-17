import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    private static int h;
    private static int w;
    public static void main(String[] args) {
        h=5;
        w=5;
        int [][]grid={
                {0, 1, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 1, 0}
        };
        find(grid,0,0,new ArrayList<>());
    }

    private static void find(int[][] grid, int x, int y, List<Pos> list) {
        if(x<0 ||x>=h || y<0 || y>=w){
            return;
        }
        if(x==h-1 && y==w-1){
            ArrayList<Pos> path= new ArrayList<>(list);
            path.add(new Pos(x,y));
            for (Pos pos : path) {
                System.out.println(pos);
            }
            return;
        }

        if(grid[x][y]==0){
            ArrayList<Pos> path= new ArrayList<>(list);
            path.add(new Pos(x,y));
            grid[x][y]=1;
            find(grid,x-1,y,path);
            find(grid,x+1,y,path);
            find(grid,x,y-1,path);
            find(grid,x,y+1,path);
        }
    }

    private static class Pos {
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x +
                    "," + y +
                    ')';
        }
    }
}
