import java.text.CollationElementIterator;
import java.util.*;

public class HJ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        String x = sc.next();
        int k = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        for (String str : strs) {
            if (isbrother(x, str)) {
                list.add(str);
                cnt++;
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        if(k<=list.size()){
            System.out.println(list.get(k - 1));
        }

    }

    private static boolean isbrother(String x, String str) {
        if (str.length() != x.length() || x.equals(str)) {
            return false;
        }
        char[] ch1 = x.toCharArray();
        char[] ch2 = str.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return new String(ch1).equals(new String(ch2));
    }
}
