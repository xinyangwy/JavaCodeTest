import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs[] = new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        }
//        TreeMap<String,Integer> map=new TreeMap<>();
        Map<String,Integer> map=new HashMap<>();
        for (String str : strs) {
            map.put(str,fun(str));
//            System.out.println(fun(str));
        }

        List<Map.Entry<String,Integer>> list =new ArrayList<>(map.entrySet());
        Collections.sort(list,((o1, o2) -> {
            if(o1.getValue().equals(o2.getValue())){
//                System.out.println("!=" +o1.getKey().length());
                if(o1.getKey().length()==o2.getKey().length()){
//                    System.out.println(o1.getKey().length());
                    char tmp=o1.getKey().charAt(0);
                    char tmp2=o2.getKey().charAt(0);
                    return tmp-tmp2;
//                    return o1.getKey().compareTo(o2.getKey());
                }

                return o1.getKey().length()-o2.getKey().length();
            }
//            System.out.println("wai=" +o1.getKey().length() + " " +o2.getKey().length());
            return o1.getValue()-o2.getValue();
        }));

        for (Map.Entry<String, Integer> entry : list) {
//            System.out.println(entry);

            System.out.println(entry.getKey());
        }
    }

    public static int  fun(String str) {
        String strs[] = str.split("/");
        int sum = 0;
        for (String s : strs) {
            if (s.length() == 19 && s.indexOf("T") == 10) {
                int y = Integer.parseInt(s.substring(0, 4));
                int m = Integer.parseInt(s.substring(5, 7));
                int d = Integer.parseInt(s.substring(8, 10));
                int shi = Integer.parseInt(s.substring(11, 13));
                int fen = Integer.parseInt(s.substring(14, 16));
                int second = Integer.parseInt(s.substring(17, 19));
//                System.out.println(y + " " + m + " " + d + " " + shi + " " + fen + " " + second + " ");
                sum = sum + (y-1800)*365*12*60*60 + m*30*12*60*60 - 0 + d*12*60*60 - 0 + shi*60*60 - 0 + fen*60 - 0 + second - 0;
            }
        }
        return sum;
    }
}