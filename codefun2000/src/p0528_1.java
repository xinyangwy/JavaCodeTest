
import java.io.*;
import java.util.*;


public class p0528_1 {
    // 使用双端队列维护滑动区间最小值下标
    public static List<Integer> bestStation(int[] crossroads, int k) {
        int n = crossroads.length;
        if (n < 2 || k < 1 || k > n) return null; // 非法输入
        List<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        //初始化第一个区间
        int index0 = Math.min(n - 1, k);
        for (int i = 0; i <= index0; i++) {
            while (!dq.isEmpty() && crossroads[dq.peekLast()] >= crossroads[i]) {
                dq.pollLast();//如果队尾元素大就是删除
            }
            dq.offerLast(i);
        }
        res.add(dq.peekFirst());

        //滑动窗口中动态调整dq的内容
        for (int i = 1; i < n - 1; i++) {
            int left = Math.max(0, i - k + 1);
            int right = Math.min(n - 1, i + k);
            //加上后面的，//如果队尾元素大就是删除队尾的
            while (!dq.isEmpty() && crossroads[dq.peekLast()] >= crossroads[right]) {
                dq.pollLast();
            }
            dq.offerLast(right);
            //删除前面的
            while (!dq.isEmpty() && dq.peekFirst() < left) {
                dq.pollFirst();
            }
            res.add(dq.peekFirst());
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        int n = words.length;
        int[] crossroads = new int[n];
        for (int i = 0; i < n; i++) {
            crossroads[i] = Integer.parseInt(words[i]);
        }
        int range = sc.nextInt();
        List<Integer> res = bestStation(crossroads, range);
        if (res==null) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < res.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(res.get(i));
            }
        }
    }
}
