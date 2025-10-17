import java.io.*;
import java.util.*;

public class P3299 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<List<String>> stk = new Stack<>();
        HashMap<String, Integer> map = new HashMap<>();
        List<String> output = new ArrayList<>();
        boolean error = false;
        //为什么没有直接输出 而是直接放在output中间，因为输出是逆序  没办法直接输出
        //真正的删除是在map中进行的  stk中存储了每个域中所有的变量
        //所在的每层 始终是stk的栈顶层，lvl=stk.size() - 1
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().replaceAll("^\\s+","");
            if (line.equals("{")) {
                stk.push(new ArrayList<>());
            } else if (line.equals("}")) {
                // 自动销毁
                List<String> frame = stk.pop();
                //存到output中
                for (int k = frame.size() - 1; k >= 0; k--) {
                    String var = frame.get(k);
                    if (map.containsKey(var)) {//如果没有被手动销毁 就自动销毁
                        output.add(var);//自动销毁之后需要输出
                        map.remove(var);// 销毁
                    }
                }
            } else if (line.startsWith("let")) {
                String var = line.substring(4);
                int lvl = stk.size() - 1;
                stk.get(lvl).add(var);
                map.put(var, lvl);
            } else if (line.startsWith("drop")) {
                String var = line.substring(5);
                // 为什么需要设置  level，因为虽然经过 “}” 之后，drop不会去动内层的var ,但是drop可能会去动内层的var
                if (!map.containsKey(var) || map.get(var) != stk.size() - 1) {
                    error = true;//如果 (销毁没有声明的变量/已经被删除(被删除过一次))  或者  删除的字母不在本层
                } else {
                    output.add(var);//手动销毁之后需要输出
                    map.remove(var);//销毁
                }
            }
            if (error) break;
        }
        // 输出结果
        for (String s : output) {
            System.out.print(s + " ");
        }
        if (error) {
            System.out.print("Error");
        }
    }

}
