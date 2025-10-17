import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class HJ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        ArrayList<Stack<Integer>> list = new ArrayList<>();
        int length=1;
        while(length<=n){
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < length; i++,num++) {
                stack.push(num);
            }
            list.add(stack);
            length++;
        }
        for (int i = 0; i < n; i++) {
            for (Stack<Integer> stk : list) {
                if (!stk.isEmpty()){
                    System.out.print(stk.pop()+" ");
                }
            }
            System.out.println();
        }


    }
}
