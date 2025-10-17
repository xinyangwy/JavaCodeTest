import java.io.*;
import java.util.*;

public class Main {
    // 使用双端队列维护滑动区间最小值下标
    public static List<Integer> bestStation(int[] crossroads, int k) {
        int n = crossroads.length;
        if (n < 2 || k < 1 || k > n) return null; // 非法输入

        List<Integer> ret = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        // 初始化第0号路段区间 [0, min(n-1,k)]
        int R0 = Math.min(n-1, k);
        for (int i = 0; i <= R0; i++) {
            while (!dq.isEmpty() && crossroads[i] <= crossroads[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        ret.add(dq.peekFirst());

        // 处理后续路段
        for (int i = 1; i < n-1; i++) {
            int Li = Math.max(0, i+1-k);
            int Ri = Math.min(n-1, i+k);

            while (!dq.isEmpty() && crossroads[Ri] <= crossroads[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(Ri);

            while (!dq.isEmpty() && dq.peekFirst() < Li) {
                dq.pollFirst();
            }
            ret.add(dq.peekFirst());
        }
        return ret;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split("\\s+");
        int[] crossroads = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        int k;
        try {
            k = Integer.parseInt(br.readLine().trim());
        } catch (Exception e) {
            System.out.println(-1);
            return;
        }
        List<Integer> ans = bestStation(crossroads, k);
        if (ans == null) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < ans.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(ans.get(i));
            }
        }
    }
}
