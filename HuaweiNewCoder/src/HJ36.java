import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HJ36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        s=getUnique(s);
        s=addStr(s);
        System.out.println(myEncrypt(s,t));
    }

    private static String myEncrypt(String s, String t) {
//        LinkedHashMap<Integer, Character> map = new LinkedHashMap<>();
        TreeMap<Integer, Character> map = new TreeMap<>();
        int index=0;
        for (char c : s.toCharArray()) {
            map.put(index,c);
            index++;
        }
        String res="";
        for (char c : t.toCharArray()) {
            res+=map.get(c-'a');
        }
        return res;
    }

    private static String addStr(String s) {
        char []ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (char c : s.toCharArray()) {
            ch[c-'a']=' ';
        }
        for (char c : ch) {
            if(c!=' '){
                s+=c;
            }
        }
        return s;
    }

    private static String getUnique(String s) {
        LinkedHashSet<Character> ls = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            ls.add(c);
        }
        String res="";
        for (Character c : ls) {
            res+=c;
        }
        return res;
    }
}
