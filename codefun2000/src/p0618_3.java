import java.util.Scanner;

public class p0618_3 {
    static int[] parent, sz;//sz[i] 表示 以节点 i 为根的连通分量的大小（即该连通分量中包含的节点总数）。
    static int rejects = 0;
    static boolean[] blocked;//blocked[i] 表示 以节点 i 为根的连通分量是否包含被标记为 “互斥” 的节点。

    public static int findp(int x) {
        if (parent[x] != x) {//如果自己的父节点不是自己，那么就说明自己不是单个节点，就一直向上找
            parent[x] = findp(parent[x]);
        }
        return parent[x];
    }

    public static void unite(int n1, int n2) {
        if(n1==n2){
            return;
        }
        if (sz[n1] < sz[n2]) {
            int tmp = n1;
            n1=n2;
            n2 = tmp;
        }
        parent[n2] = n1;
        sz[n1] += sz[n2];
        blocked[n1] = blocked[n1] || blocked[n2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int[] nodes = new int[N];
        int[] mutexs = new int[M];
        int[] instructions = new int[X];
        parent = new int[N];
        sz = new int[N];
        blocked = new boolean[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
            blocked[i] = false;
            parent[i] = i;
        }
        for (int i = 0; i < M; i++) {
            blocked[sc.nextInt()] = true;
        }
        for (int i = 0; i < X; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int n1=findp(u);
            int n2=findp(v);
            if(n1!=n2&& blocked[n1]&&blocked[n2]){
                rejects++;
            }else {
                unite(n1,n2);
            }
        }
        System.out.println(rejects);
    }
}
