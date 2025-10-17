

import java.util.Scanner;
import java.util.TreeSet;

public class HJ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet<Integer> treeSet= new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(sc.nextInt());

        }
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }
}
