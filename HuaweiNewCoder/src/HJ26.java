import java.util.*;

public class HJ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        TreeMap<Integer, List<Character>> map = new TreeMap<>();
        TreeMap<Integer, Character> mapIndex = new TreeMap<>();

        //26个位置先放
        for (int i = 0; i < str.length() ; i++) {
            char c=str.charAt(i);
            if(c>='A' && c<='Z'){
                map.computeIfAbsent(c-'A', k -> new ArrayList<>()).add(c);
            } else if(c>='a' && c<='z'){
                map.computeIfAbsent(c-'a', k -> new ArrayList<>()).add(c);
            }else{
                mapIndex.put(i,c);
            }
        }

        ArrayList<Character> res = new ArrayList<>();
        for (List<Character> list : map.values()) {
            for (Character c : list) {
                res.add(c);
            }
        }

        for (Map.Entry<Integer, Character> entry : mapIndex.entrySet()) {
            res.add(entry.getKey(),entry.getValue());
        }
        for (Character re : res) {
            System.out.print(re);
        }
    }
}
