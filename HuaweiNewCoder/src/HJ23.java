import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class HJ23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        char []ch=str.toCharArray();
        for (char c : ch) {
            map.merge(c,1,Integer::sum);
        }
        Collection<Integer> values = map.values();
        Integer min= Collections.min(values);

        for (char c : ch) {
            if(map.get(c)==min){
                str=str.replaceAll(String.valueOf(c),"");
            }
        }
        System.out.println(str);
    }
}
