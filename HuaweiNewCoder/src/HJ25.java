import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class HJ25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n=sc.nextInt();
        String []Ins=new String[n];
        for (int i = 0; i < n; i++) {
            Ins[i]=sc.next();
        }
        int m=sc.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            treeSet.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>(treeSet);
        ArrayList<List<String>> res = new ArrayList<>();
        int totalCnt=0;
        for (int li : list) {
            String  s=String.valueOf(li);
            ArrayList<String> tmp = new ArrayList<>();
            for (int i = 0; i < Ins.length; i++) {
                if(Ins[i].contains(s)){
                    tmp.add(String.valueOf(i));
                    tmp.add(Ins[i]);
                    totalCnt+=2;
                }
            }
            if(tmp.isEmpty()){
                continue;
            }
            tmp.add(0, String.valueOf(tmp.size()/2));
            tmp.add(0,s);
            totalCnt+=2;
            res.add(tmp);
        }
        res.add(0,Arrays.asList(String.valueOf(totalCnt)));
        for (List<String> re : res) {
            for (String s : re) {
                System.out.print(s+" ");
            }
        }
    }
}
