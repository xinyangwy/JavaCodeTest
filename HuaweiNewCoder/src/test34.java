import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim()); // 读取总行数 N
        Stack  <List<String>> scopeStack = new Stack<>();  // 作用域栈
        Map<String, Integer> map = new HashMap<>();           // 变量 ，层级
        List<String> output = new ArrayList<>();
        boolean error = false;
        //为什么没有直接输出 而是直接放在output中间，因为输出是逆序  没办法直接输出
        for (int i = 0; i < N; i++) {
            String line = br.readLine().replaceAll("^\\s+", "");
            if (line.equals("{")) {
                scopeStack.push(new ArrayList<>());
            } else if (line.equals("}")) {
                List<String> frame = scopeStack.pop();
                // 自动销毁
                for (int k = frame.size() - 1; k >= 0; k--) {
                    String var = frame.get(k);
                    if (map.containsKey(var)) {
                        output.add(var);
                        map.remove(var);
                    }
                }
            } else if (line.startsWith("let ")) {
                String var = line.substring(4);
                int lvl = scopeStack.size() - 1;
                scopeStack.get(lvl).add(var);
                map.put(var, lvl);
            } else if (line.startsWith("drop ")) {
                String var = line.substring(5);
                // 为什么需要设置  level，因为虽然经过 “}” 之后，drop不会去动内层的var ,但是drop可能会去动内层的var
                if (!map.containsKey(var) || map.get(var) != scopeStack.size() - 1  ) {
                    error = true;//如果 (销毁没有声明的变量/已经被删除(被删除过一次))  或者  删除的字母不在本层
                } else {
                    output.add(var);
                    map.remove(var);//删除
                }
            }
            if (error) break;
        }

        // 输出结果
        for (String v : output) {
            System.out.print(v + " ");
        }
        if (error) {
            System.out.print("Error");
        }
    }
}
